package co.com.bancolombia;


public class Servicio implements Pagable{
    private final String descripcion;
    private final double precioHora;
    private final double horasTrabajadas;

    public Servicio(String descripcion, double precioHora, double horasTrabajadas) {
        this.descripcion = descripcion;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularTotal() {
        return precioHora * horasTrabajadas;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return calcularTotal() * (1 - porcentaje / 100);
    }
}