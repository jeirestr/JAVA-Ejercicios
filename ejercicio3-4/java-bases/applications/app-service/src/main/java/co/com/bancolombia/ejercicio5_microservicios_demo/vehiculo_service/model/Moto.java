package co.com.bancolombia.ejercicio5_microservicios_demo.vehiculo_service.model;

public class Moto extends Vehiculo {
    private double consumoPorKm;

    public Moto(int id, String marca, String modelo, int año, double consumoPorKm) {
        super(id, marca, modelo, año);
        this.consumoPorKm = consumoPorKm;
    }

    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * consumoPorKm;
    }

    @Override
    public String getTipo() {
        return "MOTO";
    }

    @Override
    public double getConsumoPorKm() {
        return consumoPorKm;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "id=" + getId() +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", año=" + getAño() +
                ", consumoPorKm=" + consumoPorKm +
                '}';
    }
}
