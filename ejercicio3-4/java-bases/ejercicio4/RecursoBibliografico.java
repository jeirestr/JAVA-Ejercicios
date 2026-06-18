package co.com.bancolombia.ejercicio4;

public abstract class RecursoBibliografico {

    private final String titulo;
    private final String autor;
    private final int anioPublicacion;

    protected RecursoBibliografico(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public abstract String obtenerResumen();
}

