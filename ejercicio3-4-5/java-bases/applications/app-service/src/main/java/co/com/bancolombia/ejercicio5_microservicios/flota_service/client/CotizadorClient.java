package co.com.bancolombia.ejercicio5_microservicios.flota_service.client;

import co.com.bancolombia.ejercicio5_microservicios.cotizador_service.model.CotizacionRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

// Feign busca en Eureka el servicio registrado como "cotizador-service"
// y le hace las peticiones automaticamente, sin IP fija.
@FeignClient(name = "cotizador-service")
public interface CotizadorClient {

    @PostMapping("/cotizar")
    Map cotizarVehiculo(@RequestBody CotizacionRequest request);
}

