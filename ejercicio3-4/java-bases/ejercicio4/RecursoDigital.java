package co.com.bancolombia.ejercicio4;

public class RecursoDigital extends RecursoBibliografico {

    private final String formato;
    private final double tamanioMB;

    public RecursoDigital(String titulo, String autor, int anioPublicacion, String formato, double tamanioMB) {
        super(titulo, autor, anioPublicacion);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    public String getFormato() {
        return formato;
    }

    public double getTamanioMB() {
        return tamanioMB;
    }

    @Override
    public String obtenerResumen() {
        return String.format(
                "Recurso digital '%s' de %s (%d), formato %s, %.2f MB",
                getTitulo(),
                getAutor(),
                getAnioPublicacion(),
                formato,
                tamanioMB
        );
    }
}

