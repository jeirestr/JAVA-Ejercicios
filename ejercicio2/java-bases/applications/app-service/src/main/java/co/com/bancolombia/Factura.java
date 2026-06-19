package co.com.bancolombia;

import java.util.List;
import java.util.ArrayList;

public class Factura {
    private final String numero;
    private final List<Pagable> items = new ArrayList<>();

    public Factura(String numero) {
        this.numero = numero;
    }

    public void agregarItem(Pagable item) {
        items.add(item);
    }

    public double calcularGrandTotal() {
        return items.stream().mapToDouble(Pagable::calcularTotal).sum();
    }

    public void imprimir() {
        items.forEach(i -> System.out.println(i.resumen()));
        System.out.println("TOTAL: $" + calcularGrandTotal());
    }
}