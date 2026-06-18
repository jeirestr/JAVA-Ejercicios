package co.com.bancolombia.ejercicio3;

public class Auto extends Vehiculo {
    private double consumoPorKm;

    public Auto(String marca, String modelo, int año, double consumoPorKm) {
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
        return "Auto{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", año=" + getAño() +
                ", consumoPorKm=" + consumoPorKm +
                '}';
    }
}

