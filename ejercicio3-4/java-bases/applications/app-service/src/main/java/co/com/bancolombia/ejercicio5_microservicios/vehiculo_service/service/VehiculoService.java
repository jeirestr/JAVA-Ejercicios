package co.com.bancolombia.ejercicio5_microservicios.vehiculo_service.service;

import co.com.bancolombia.ejercicio5_microservicios.vehiculo_service.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehiculoService {

    private final List<Vehiculo> flota = new ArrayList<>();
    private int contadorId = 4;

    public VehiculoService() {
        // Datos pre-cargados del ejercicio3
        flota.add(new Auto(1, "Nissan", "March", 2016, 0.08));
        flota.add(new Moto(2, "Boxer", "XPro", 2022, 0.05));
        flota.add(new AutoElectrico(3, "Mazda", "Touring 3", 2018, 0.05, 99.0));
    }

    public List<Vehiculo> listarTodos() {
        return flota;
    }

    public Vehiculo buscarPorId(int idVehiculo) {
        for (Vehiculo vehiculo : flota) {
            if (vehiculo.getId() == idVehiculo) {
                return vehiculo;
            }
        }
        return null;
    }

    public Vehiculo agregarVehiculo(Vehiculo vehiculo) {
        flota.add(vehiculo);
        return vehiculo;
    }

    public int generarId() {
        return contadorId++;
    }
}
