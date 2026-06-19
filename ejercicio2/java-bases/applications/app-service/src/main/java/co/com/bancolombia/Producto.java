package co.com.bancolombia;


public class Producto implements Pagable {
    private final String nombre;
    private final double precio;
    private final int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public double calcularTotal() {
        return precio * cantidad;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return calcularTotal() * (1 - porcentaje / 100);
    }

}
