package co.com.bancolombia;

import java.util.List;
import java.util.ArrayList;

public class Factura {
    private String numeroFactura;
    private String cliente;
    private  List<Pagable> items;

    public Factura(String numeroFactura, String cliente) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    Public void agregarItem(Pagable item) {
        this.items.add(item);
        System.out.println("Item agregado " + item.descripcion());
    }

    public double calcularGrandTotal(){
        double grandTotal = (double)0.0F;

        for (Pagable item : items) {
            grandTotal += item.calcularTotal();
        }

        return grandTotal;
    }

    public void imprimirFactura() {
        System.out.println(x:"\n |--------------------|");
        System.out.println(x:"\n |     Factura        |");
        System.out.println(x:"\n |--------------------|");
        System.out.println("\nNumero de factura: " + this.numeroFactura);
        System.out.println("\nCliente: " + this.cliente);
        System.out.println(x: "Items");
        for (Pagable item : this.items) {
            System.out.println("- " + item.descripción() + ": $" + item.calcularPago());
        }
        System.out.println("Total a pagar: $" + calcularGrandTotal())
    }

    public void serializarItems() {
        System.out.println(x: "\nSerializado items de la factura...");
        for (Pagable item : this.items) {
            if (item instanceof Serializable) {
                System.out.prinln(" "+ ((Serializable) item).Serializar());
            }
        }
    }

    public List<Pagable> getItems() {
        return this.items;
    }

    public String getNumeroFactura() {
        return this.numeroFactura;
    }

    public String getCliente() {
        return this.cliente;
    }
}