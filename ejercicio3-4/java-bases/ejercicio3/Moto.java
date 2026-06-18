package co.com.bancolombia.ejercicio3;

public class Moto extends Vehiculo {
    private double consumoPorKm;

    public Moto(String marca, String modelo, int año, double consumoPorKm) {
        super(marca, modelo, año);
        this.consumoPorKm = consumoPorKm;
    }

    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * consumoPorKm;
    }

    public double getConsumoPorKm() {
        return consumoPorKm;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", año=" + getAño() +
                ", consumoPorKm=" + consumoPorKm +
                '}';
    }
}

