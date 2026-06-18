package co.com.bancolombia.ejercicio3;

public class AutoElectrico extends Auto implements VehiculoElectrico {
    private double capacidadBateria;
    private double nivelCarga;

    public AutoElectrico(String marca, String modelo, int año, double consumoPorKm,
                         double capacidadBateria) {
        super(marca, modelo, año, consumoPorKm);
        this.capacidadBateria = capacidadBateria;

    }

    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * getConsumoPorKm();
    }

    @Override
    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    @Override
    public double getNivelCarga() {
        return nivelCarga;
    }

    @Override
    public void cargarBateria() {
        this.nivelCarga = capacidadBateria;
    }

    @Override
    public String toString() {
        return "AutoElectrico{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", año=" + getAño() +
                ", consumoPorKm=" + getConsumoPorKm() +
                ", capacidadBateria=" + capacidadBateria +
                ", nivelCarga=" + nivelCarga +
                '}';
    }
}

