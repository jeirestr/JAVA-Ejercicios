package co.com.bancolombia;

public class Main {
        public static void main(String[] args) {
                Factura factura = new Factura("F-001");

                factura.agregarItem(new Producto("Laptop", 999.99, 1));
                factura.agregarItem(new Producto("Mouse", 25.00, 2));
                factura.agregarItem(new Servicio("Soporte Tecnico", 80.0, 3));

                factura.imprimir();
        }
}
