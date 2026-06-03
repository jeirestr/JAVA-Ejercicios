package co.com.bancolombia;

public class main {
    public Main(){
    }

    public static void main (String[] args) {
        System.out.println("Ejercicio 4: Factura con Polimorfismo y Serialización");
        Producto laptop = new Producto(nombre: "Laptop", (double) 1200.00F, cantidad: 2);
        Producto teclado = new Producto(nombre: "teclado", (double) 1500.00F, cantidad: 3);
        Producto monitor = new Producto(nombre: "monitor", (double) 5200.00F, cantidad: 1);
        Servicio soporte = new Servicio(descripcion: "soporte tecnico", (double) 300.00F, horasTrabajadas: 5);
        Servicio desarrollo = new Servicio(descripcion: "Desarrollo de sotfware", (double) 500.00F, horasTrabajadas: 10);

        Factura factura = new Factura(numeroFactura: "F001", cliente: "Juan Perez");
        factura.agregar(laptop);
        factura.agregar(teclado);
        factura.agregar(monitor);
        factura.agregar(soporte);
        factura.agregar(desarrollo);
        factura.imprimirFactura();
        factura.serializarItems();

        Pagable [] elementos = new Pagable[](laptop, teclado, monitor, soporte, desarrollo);

        for (Pagable elemento : elementos) {
            System.out.println("\nDescripcion: " + elemento.descripcion());
            System.out.println("Pago a serializar: $" + elemento.calcular());
        }
    }
}