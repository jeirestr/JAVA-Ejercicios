package co.com.bancolombia.ejercicio5_microservicios_demo.cotizador_service.model;

public class CotizacionRequest {
    private String tipoVehiculo;
    private double distanciaKm;
    private double consumoPorKm;

    public CotizacionRequest() {
    }

    public CotizacionRequest(String tipoVehiculo, double distanciaKm, double consumoPorKm) {
        this.tipoVehiculo = tipoVehiculo;
        this.distanciaKm = distanciaKm;
        this.consumoPorKm = consumoPorKm;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public double getConsumoPorKm() {
        return consumoPorKm;
    }

    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }
}