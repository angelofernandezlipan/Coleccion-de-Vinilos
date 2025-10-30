public class Vinilo {
    private final String artista;
    private final String nombreDisco;
    private final String anoLanzamiento;

    public Vinilo(String artista, String nombreDisco, String anoLanzamiento) {
        if (artista == null || artista.trim().isEmpty()) {
            throw new IllegalArgumentException("El artista no puede estar vacío");
        }
        if (nombreDisco == null || nombreDisco.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del disco no puede estar vacío");
        }
        this.artista = artista.trim();
        this.nombreDisco = nombreDisco.trim();
        this.anoLanzamiento = anoLanzamiento != null ? anoLanzamiento.trim() : "";
    }

    public String getArtista() {
        return artista;
    }

    public String getNombreDisco() {
        return nombreDisco;
    }

    public String getAnoLanzamiento() {
        return anoLanzamiento;
    }

    @Override
    public String toString() {
        return artista + " - " + nombreDisco +
                (anoLanzamiento.isEmpty() ? "" : " - " + anoLanzamiento);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vinilo)) return false;
        Vinilo otro = (Vinilo) obj;
        return artista.equalsIgnoreCase(otro.artista) &&
                nombreDisco.equalsIgnoreCase(otro.nombreDisco);
    }

    @Override
    public int hashCode() {
        return artista.toLowerCase().hashCode() + nombreDisco.toLowerCase().hashCode();
    }
}