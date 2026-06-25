package co.com.bancolombia.ejercicio5_microservicios.cotizador_service.service;

import co.com.bancolombia.ejercicio5_microservicios.cotizador_service.model.CotizacionRequest;
import org.springframework.stereotype.Service;

@Service
public class CotizacionService {

        public double calcularCosto(CotizacionRequest request) {
        return request.getDistanciaKm() * request.getConsumoPorKm();
    }
}
