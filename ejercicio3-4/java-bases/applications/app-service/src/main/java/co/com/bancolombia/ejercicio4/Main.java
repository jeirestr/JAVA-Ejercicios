package co.com.bancolombia.ejercicio4;


public class Main {

    public static void main(String[] args) {
        BibliotecaDigital biblioteca = new BibliotecaDigital();

        biblioteca.agregarRecurso(new LibroElectronico(
                "Clean Architecture",
                "Robert C. Martin",
                2017,
                "EPUB",
                2.4,
                432,
                true
        ));
        biblioteca.agregarRecurso(new LibroElectronico(
                "Domain-Driven Design",
                "Eric Evans",
                2003,
                "PDF",
                5.8,
                560,
                false
        ));
        biblioteca.agregarRecurso(new RecursoDigital(
                "Java Magazine",
                "Oracle",
                2024,
                "PDF",
                14.2
        ));

        System.out.println("=== Recursos en la biblioteca ===");
        for (RecursoDigital recurso : biblioteca.getRecursos()) {
            System.out.println("- " + recurso.obtenerResumen());
        }

        System.out.println("\n=== Libro electronico mas antiguo ===");
        biblioteca.encontrarLibroElectronicoMasAntiguo()
                .ifPresentOrElse(
                        libro -> System.out.println("- " + libro.obtenerResumen()),
                        () -> System.out.println("- No hay libros electronicos en la coleccion")
                );
    }
}
