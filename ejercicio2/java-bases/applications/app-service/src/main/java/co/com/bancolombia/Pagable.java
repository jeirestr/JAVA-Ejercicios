package co.com.bancolombia;

public interface Pagable {
    double calcularTotal();
    double aplicarDescuento(double porcentaje);

    default String resumen() {
        return "Total: $" + calcularTotal();
    }
}