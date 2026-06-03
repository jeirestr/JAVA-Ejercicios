package co.com.bancolombia;

public class Servicio implements Pagable, Serializable{

    private String descripcion;
    private double precioHora;
    private double horasTrabajadas;

    public Servicio(String descripcion, double precioHora, double horasTrabajadas) {
        this.descripcion = descripcion;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calculaTotal() {
        return precioHora * horasTrabajadas;
    }

    public double aplicarDescuento(double porcentaje) {
        double total = calculaTotal();
        return total - (total * porcentaje / 100);
    }

    public String descripcion() {
        return String.format("Servicio: %s | Precio/hora: $%.2f | Horas: %.1f | Total con Descuento: $%.2f", this.descripcion, this.precioHora, this.horasTrabajadas, this.aplicarDescuento(10));
    }

    public String serializar() {
        return String.format(format: "{tipo: 'Servicio', descripcion: '%s', precioHora: %.2f, horas: %.1f, total:%.2f}", this.descripcion, this.precioHora, this.horasTrabajadas, this.calculaTotal());
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPrecioHora() {
        return this.precioHora;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        return this.horasTrabajadas;
    }

    public String toString() {
        return this.descripcion
    }
}