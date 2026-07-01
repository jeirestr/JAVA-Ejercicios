package co.com.bancolombia.ejercicio5_microservicios.flota_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

// Feign busca en Eureka el servicio registrado como "vehiculo-service"
// y le hace las peticiones automaticamente, sin IP fija.
@FeignClient(name = "vehiculo-service")
public interface VehiculoClient {

    @GetMapping("/vehiculos")
    List<Map> obtenerVehiculos();
}

