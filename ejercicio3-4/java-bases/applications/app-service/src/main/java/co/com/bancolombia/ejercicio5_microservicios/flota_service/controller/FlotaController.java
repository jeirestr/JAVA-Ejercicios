package co.com.bancolombia.ejercicio5_microservicios.flota_service.controller;

import co.com.bancolombia.ejercicio5_microservicios.flota_service.client.FlotaClient;
import co.com.bancolombia.ejercicio5_microservicios.flota_service.dto.CotizacionFlotaResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/flota")
public class FlotaController {

    private final FlotaClient flotaClient;

    public FlotaController(FlotaClient flotaClient) {
        this.flotaClient = flotaClient;
    }

    @GetMapping("/cotizar")
    public Map<String, Object> cotizarFlota(@RequestParam double distancia) {

        // 1. Obtener todos los vehículos
        List<Map> vehiculos = flotaClient.obtenerVehiculos();

        // 2. Cotizar cada vehículo
        List<CotizacionFlotaResponse> cotizaciones = new ArrayList<>();
        CotizacionFlotaResponse masEconomico = null;

        for (Map vehiculo : vehiculos) {
            String tipo = (String) vehiculo.get("tipo");
            double consumoPorKm = ((Number) vehiculo.get("consumoPorKm")).doubleValue();
            int id = ((Number) vehiculo.get("id")).intValue();
            String marca = (String) vehiculo.get("marca");
            String modelo = (String) vehiculo.get("modelo");

            // Llamar a cotizador-service
            Map resultado = flotaClient.cotizarVehiculo(tipo, distancia, consumoPorKm);
            double costo = ((Number) resultado.get("costo")).doubleValue();

            CotizacionFlotaResponse cotizacion = new CotizacionFlotaResponse(
                    id, marca, modelo, tipo, distancia, consumoPorKm, costo
            );
            cotizaciones.add(cotizacion);

            // Buscar el más económico)
            if (masEconomico == null || costo < masEconomico.getCosto()) {
                masEconomico = cotizacion;
            }
        }


        return Map.of(
                "distanciaKm", distancia,
                "cotizaciones", cotizaciones,
                "vehiculoMasEconomico", masEconomico != null ? masEconomico : "Sin vehículos"
        );
    }
}
