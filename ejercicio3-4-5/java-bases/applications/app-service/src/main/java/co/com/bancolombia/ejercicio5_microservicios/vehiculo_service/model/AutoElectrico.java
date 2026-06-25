package co.com.bancolombia.ejercicio5_microservicios.vehiculo_service.model;

public class AutoElectrico extends Auto {
    private double capacidadBateria;
    private double nivelCarga;

    public AutoElectrico(int id, String marca, String modelo, int año, double consumoPorKm,
                         double capacidadBateria) {
        super(id, marca, modelo, año, consumoPorKm);
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * getConsumoPorKm();
    }

    @Override
    public String getTipo() {
        return "ELECTRICO";
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public double getNivelCarga() {
        return nivelCarga;
    }

    public void cargarBateria() {
        this.nivelCarga = capacidadBateria;
    }

    @Override
    public String toString() {
        return "AutoElectrico{" +
                "id=" + getId() +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", año=" + getAño() +
                ", consumoPorKm=" + getConsumoPorKm() +
                ", capacidadBateria=" + capacidadBateria +
                ", nivelCarga=" + nivelCarga +
                '}';
    }
}
