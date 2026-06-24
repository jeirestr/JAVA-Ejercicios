package co.com.bancolombia.ejercicio5_microservicios_demo.vehiculo_service.model;

public abstract class Vehiculo {
    private int id;
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(int id, String marca, String modelo, int año) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public abstract double calcularCostoViaje(double distancia);

    public abstract String getTipo();

    public abstract double getConsumoPorKm();

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    @Override
    public String toString() {
        return getTipo() + "{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                '}';
    }
}
