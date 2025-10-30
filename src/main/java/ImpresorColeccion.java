import java.util.List;

public class ImpresorColeccion {

    public void mostrarEncabezado(int capacidadMaxima) {
        System.out.println("Espacio máximo colección: " + capacidadMaxima);
    }

    public void mostrarTotalVinilos(int total) {
        System.out.println("Hay un total de: " + total + " vinilos en la colección.");
    }

    public void mostrarEspaciosDisponibles(int espacios) {
        System.out.println("\nHay un total de: " + espacios +
                " espacios disponibles en la colección.");
    }

    public void mostrarResultadoBusqueda(String artista, boolean encontrado) {
        System.out.println("\nBuscar artista: " + artista);
        if (encontrado) {
            System.out.println("El artista " + artista + " si esta en la colección");
        } else {
            System.out.println("El artista " + artista + " no esta en la colección");
        }
    }

    public void mostrarListaVinilos(List<Vinilo> vinilos) {
        System.out.println();
        for (int i = 0; i < vinilos.size(); i++) {
            System.out.println("Fila " + (i + 1) + ": " + vinilos.get(i));
        }
    }

    public void mostrarError(String mensaje) {
        System.err.println("Error: " + mensaje);
    }
}