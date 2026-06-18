package co.com.bancolombia.ejercicio4;


public class LibroElectronico extends RecursoDigital {

    private final int numeroPaginas;
    private final boolean tieneDRM;

    public LibroElectronico(
            String titulo,
            String autor,
            int anioPublicacion,
            String formato,
            double tamanioMB,
            int numeroPaginas,
            boolean tieneDRM
    ) {
        super(titulo, autor, anioPublicacion, formato, tamanioMB);
        this.numeroPaginas = numeroPaginas;
        this.tieneDRM = tieneDRM;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public boolean isTieneDRM() {
        return tieneDRM;
    }

    @Override
    public String obtenerResumen() {
        return String.format(
                "Libro electronico '%s' de %s (%d), formato %s, %.2f MB, %d paginas, DRM: %s",
                getTitulo(),
                getAutor(),
                getAnioPublicacion(),
                getFormato(),
                getTamanioMB(),
                numeroPaginas,
                tieneDRM ? "si" : "no"
        );
    }
}

