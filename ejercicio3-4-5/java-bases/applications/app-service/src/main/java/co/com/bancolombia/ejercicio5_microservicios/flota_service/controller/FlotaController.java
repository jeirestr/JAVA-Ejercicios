package co.com.bancolombia.ejercicio5_microservicios.flota_service.controller;

import co.com.bancolombia.ejercicio5_microservicios.cotizador_service.model.CotizacionRequest;
import co.com.bancolombia.ejercicio5_microservicios.flota_service.client.CotizadorClient;
import co.com.bancolombia.ejercicio5_microservicios.flota_service.client.VehiculoClient;
import co.com.bancolombia.ejercicio5_microservicios.flota_service.dto.CotizacionFlotaResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/flota")
public class FlotaController {

    private final VehiculoClient vehiculoClient;
    private final CotizadorClient cotizadorClient;

    public FlotaController(VehiculoClient vehiculoClient, CotizadorClient cotizadorClient) {
        this.vehiculoClient = vehiculoClient;
        this.cotizadorClient = cotizadorClient;
    }

    @GetMapping("/cotizar")
    public Map<String, Object> cotizarFlota(@RequestParam double distancia) {

        // 1. Obtener todos los vehiculos via Feign -> Eureka -> vehiculo-service
        List<Map> vehiculos = vehiculoClient.obtenerVehiculos();

        // 2. Cotizar cada vehiculo via Feign -> Eureka -> cotizador-service
        List<CotizacionFlotaResponse> cotizaciones = new ArrayList<>();
        CotizacionFlotaResponse masEconomico = null;

        for (Map vehiculo : vehiculos) {
            String tipo = (String) vehiculo.get("tipo");
            double consumoPorKm = ((Number) vehiculo.get("consumoPorKm")).doubleValue();
            int id = ((Number) vehiculo.get("id")).intValue();
            String marca = (String) vehiculo.get("marca");
            String modelo = (String) vehiculo.get("modelo");

            CotizacionRequest request = new CotizacionRequest(tipo, distancia, consumoPorKm);
            Map resultado = cotizadorClient.cotizarVehiculo(request);
            double costo = ((Number) resultado.get("costo")).doubleValue();

            CotizacionFlotaResponse cotizacion = new CotizacionFlotaResponse(
                    id, marca, modelo, tipo, distancia, consumoPorKm, costo
            );
            cotizaciones.add(cotizacion);

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
