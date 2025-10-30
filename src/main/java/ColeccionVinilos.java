import java.util.ArrayList;
import java.util.List;

 // Gestiona una colección de vinilos con capacidad limitada.

public class ColeccionVinilos {
    private final int capacidadMaxima;
    private final List<Vinilo> vinilos;

    public ColeccionVinilos(int capacidadMaxima) {
        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a 0");
        }
        this.capacidadMaxima = capacidadMaxima;
        this.vinilos = new ArrayList<>();
    }


    public boolean agregarVinilo(Vinilo vinilo) {
        if (vinilo == null) {
            throw new IllegalArgumentException("El vinilo no puede ser nulo");
        }
        if (estaLlena()) {
            return false;
        }
        return vinilos.add(vinilo);
    }


    public Vinilo buscarPorArtista(String artista) {
        if (artista == null || artista.trim().isEmpty()) {
            return null;
        }
        return vinilos.stream()
                .filter(v -> v.getArtista().equalsIgnoreCase(artista.trim()))
                .findFirst()
                .orElse(null);
    }


    public boolean contieneArtista(String artista) {
        return buscarPorArtista(artista) != null;
    }

    public int getTotalVinilos() {
        return vinilos.size();
    }

    public int getEspaciosDisponibles() {
        return capacidadMaxima - vinilos.size();
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public boolean estaLlena() {
        return vinilos.size() >= capacidadMaxima;
    }

    public boolean estaVacia() {
        return vinilos.isEmpty();
    }

    public List<Vinilo> obtenerVinilos() {
        return new ArrayList<>(vinilos);
    }
}