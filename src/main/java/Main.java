public class Main {

    public static void main(String[] args) {
        // Inicialización
        ColeccionVinilos coleccion = new ColeccionVinilos(100); // Crea una nueva colección.
        ImpresorColeccion impresor = new ImpresorColeccion(); // Instancia el "presentador" de datos.

        // Agregar vinilos de prueba, están hardcodeados abajo.
        agregarVinilosDePrueba(coleccion);

        // Mostrar información
        impresor.mostrarEncabezado(coleccion.getCapacidadMaxima());
        impresor.mostrarTotalVinilos(coleccion.getTotalVinilos());
        impresor.mostrarEspaciosDisponibles(coleccion.getEspaciosDisponibles());

        // Buscar artista
        impresor.mostrarResultadoBusqueda("AC-DC", coleccion.contieneArtista("AC-DC"));

        // Mostrar lista de vinilos
        impresor.mostrarListaVinilos(coleccion.obtenerVinilos());
    }

    private static void agregarVinilosDePrueba(ColeccionVinilos coleccion) {
        coleccion.agregarVinilo(new Vinilo("Iron Maiden", "Iron Maiden", "1980"));
        coleccion.agregarVinilo(new Vinilo("Iron Maiden", "Killers", "1981"));
        coleccion.agregarVinilo(new Vinilo("Iron Maiden", "The number of the beast", "1982"));
        coleccion.agregarVinilo(new Vinilo("AC-DC", "Back in black", "1980"));
        coleccion.agregarVinilo(new Vinilo("AC-DC", "Highway to hell", "1979"));
        coleccion.agregarVinilo(new Vinilo("AC-DC", "Who made who", "1986"));
        coleccion.agregarVinilo(new Vinilo("Judas Priest", "British steel", "1980"));
        coleccion.agregarVinilo(new Vinilo("Judas Priest", "Painkiller", "1990"));
        coleccion.agregarVinilo(new Vinilo("Judas Priest", "Defenders of the faith", "1984"));
        coleccion.agregarVinilo(new Vinilo("Kiss", "Destroyer", "1976"));
    }
}

// Main hecho en base a lo mostrado en la imagen de la actividad.