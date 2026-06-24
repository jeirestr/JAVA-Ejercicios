package co.com.bancolombia.ejercicio5_microservicios_demo.flota_service.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class FlotaClient {

    private final RestTemplate restTemplate;

    // URLs de los otros microservicios
    private static final String VEHICULO_SERVICE_URL = "http://localhost:8081/vehiculos";
    private static final String COTIZADOR_SERVICE_URL = "http://localhost:8082/cotizar";

    public FlotaClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public List<Map> obtenerVehiculos() {
        Map[] vehiculos = restTemplate.getForObject(VEHICULO_SERVICE_URL, Map[].class);
        return vehiculos != null ? Arrays.asList(vehiculos) : List.of();
    }


    public Map cotizarVehiculo(String tipoVehiculo, double distanciaKm, double consumoPorKm) {
        Map<String, Object> request = Map.of(
                "tipoVehiculo", tipoVehiculo,
                "distanciaKm", distanciaKm,
                "consumoPorKm", consumoPorKm
        );
        return restTemplate.postForObject(COTIZADOR_SERVICE_URL, request, Map.class);
    }
}
