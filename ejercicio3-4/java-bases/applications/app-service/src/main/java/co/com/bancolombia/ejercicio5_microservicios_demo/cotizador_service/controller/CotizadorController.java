package co.com.bancolombia.ejercicio5_microservicios_demo.cotizador_service.controller;

import co.com.bancolombia.ejercicio5_microservicios_demo.cotizador_service.model.CotizacionRequest;
import co.com.bancolombia.ejercicio5_microservicios_demo.cotizador_service.service.CotizacionService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/cotizar")
public class CotizadorController {

    private final CotizacionService cotizacionService;

    public CotizadorController(CotizacionService cotizacionService) {
        this.cotizacionService = cotizacionService;
    }


    @PostMapping
    public Map<String, Object> cotizar(@RequestBody CotizacionRequest request) {
        double costo = cotizacionService.calcularCosto(request);
        return Map.of(
                "tipoVehiculo", request.getTipoVehiculo(),
                "distanciaKm", request.getDistanciaKm(),
                "consumoPorKm", request.getConsumoPorKm(),
                "costo", costo
        );
    }
}
