package co.com.bancolombia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Producto implements Pagable, Serializable {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return this.precio * (double)this.cantidad;
    }

    public double aplicarDescuento(double porcentaje) {
        double total = calcularTotal();
        return total - (total * porcentaje / 100);
    }

    public String descripcion() {
        return String.format(format: "Producto %s | Precio: %.2f | Cantidad: %d", this.nombre, this.precio, this.cantidad, this.aplicarDescuento(porcentaje: 10));
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public toString() {
        return descripcion();
    }
}
