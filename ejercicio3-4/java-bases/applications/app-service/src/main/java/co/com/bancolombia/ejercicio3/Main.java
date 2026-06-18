package co.com.bancolombia.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("=== EJERCICIO 3 ===\n");


		Auto auto = new Auto("Nissan", "march", 2016, 0.08);
		Moto moto = new Moto("Boxer", "XPro", 2022, 0.05);
		AutoElectrico autoElectrico = new AutoElectrico("Mazda", "Touring 3", 2018, 0.05, 99.0);


		List<Vehiculo> flota = new ArrayList<>();
		flota.add(auto);
		flota.add(moto);
		flota.add(autoElectrico);

		System.out.println("--- Vehiculos de la floja ---");
		for (Vehiculo vehiculo : flota) {
			System.out.println(vehiculo);
		}

		System.out.println("\n--- Costor de viaje por (50 km) ---");
		double distancia = 50.0;
		for (Vehiculo vehiculo : flota) {
			double costo = vehiculo.calcularCostoViaje(distancia);
			System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() +
							   " - Costo: $" + String.format("%.2f", costo));
		}

		System.out.println("\n--- Vehiculo Electrico ---");
		System.out.println("Marca: " + autoElectrico.getMarca());
		System.out.println("Modelo: " + autoElectrico.getModelo());
		System.out.println("Año: " + autoElectrico.getAño());
		System.out.println("Capacidad de Batería: " + autoElectrico.getCapacidadBateria() + " kWh");
		System.out.println("Nivel de Carga: " + autoElectrico.getNivelCarga() + " kWh");

		System.out.println("\n--- ¿Cual es el vehiculo mas economico? ---");
		Vehiculo maEconomico = buscarVehiculoOptimo(flota, 100.0);
		System.out.println("Vehículo más económico: " + maEconomico.getMarca() + " " +
						   maEconomico.getModelo() + " con costo: $" +
						   String.format("%.2f", maEconomico.calcularCostoViaje(100.0)));
	}


	public static Vehiculo buscarVehiculoOptimo(List<Vehiculo> flota, double distancia) {
		if (flota.isEmpty()) return null;

		Vehiculo optimal = flota.get(0);
		double costoMinimo = optimal.calcularCostoViaje(distancia);

		for (Vehiculo vehiculo : flota) {
			double costo = vehiculo.calcularCostoViaje(distancia);
			if (costo < costoMinimo) {
				costoMinimo = costo;
				optimal = vehiculo;
			}
		}

		return optimal;
	}
}
