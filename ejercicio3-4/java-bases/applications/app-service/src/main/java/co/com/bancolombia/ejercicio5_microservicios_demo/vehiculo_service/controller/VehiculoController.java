package co.com.bancolombia.ejercicio5_microservicios_demo.vehiculo_service.controller;

import co.com.bancolombia.ejercicio5_microservicios_demo.vehiculo_service.model.Vehiculo;
import co.com.bancolombia.ejercicio5_microservicios_demo.vehiculo_service.service.VehiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @GetMapping
    public List<Vehiculo> listarTodos() {
        return vehiculoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Vehiculo buscarPorId(@PathVariable int id) {
        return vehiculoService.buscarPorId(id);
    }
}
