package co.com.bancolombia.ejercicio5_microservicios_demo.flota_service.dto;

public class CotizacionFlotaResponse {
    private int vehiculoId;
    private String marca;
    private String modelo;
    private String tipo;
    private double distanciaKm;
    private double consumoPorKm;
    private double costo;

    public CotizacionFlotaResponse() {
    }

    public CotizacionFlotaResponse(int vehiculoId, String marca, String modelo, String tipo,
                                    double distanciaKm, double consumoPorKm, double costo) {
        this.vehiculoId = vehiculoId;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.distanciaKm = distanciaKm;
        this.consumoPorKm = consumoPorKm;
        this.costo = costo;
    }

    public int getVehiculoId() { return vehiculoId; }
    public void setVehiculoId(int vehiculoId) { this.vehiculoId = vehiculoId; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getDistanciaKm() { return distanciaKm; }
    public void setDistanciaKm(double distanciaKm) { this.distanciaKm = distanciaKm; }

    public double getConsumoPorKm() { return consumoPorKm; }
    public void setConsumoPorKm(double consumoPorKm) { this.consumoPorKm = consumoPorKm; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }
}
