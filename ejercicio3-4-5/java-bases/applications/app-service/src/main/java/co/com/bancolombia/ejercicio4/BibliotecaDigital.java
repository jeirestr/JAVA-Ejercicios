package co.com.bancolombia.ejercicio4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class BibliotecaDigital {

    private final List<RecursoDigital> recursos;

    public BibliotecaDigital() {
        this.recursos = new ArrayList<>();
    }

    public void agregarRecurso(RecursoDigital recurso) {
        recursos.add(recurso);
    }

    public List<RecursoDigital> getRecursos() {
        return Collections.unmodifiableList(recursos);
    }

    public Optional<LibroElectronico> encontrarLibroElectronicoMasAntiguo() {
        LibroElectronico masAntiguo = null;

        for (RecursoDigital recurso : recursos) {
            if (recurso instanceof LibroElectronico libroActual
                    && (masAntiguo == null
                    || libroActual.getAnioPublicacion() < masAntiguo.getAnioPublicacion())) {
                masAntiguo = libroActual;
            }
        }

        return Optional.ofNullable(masAntiguo);
    }
}

