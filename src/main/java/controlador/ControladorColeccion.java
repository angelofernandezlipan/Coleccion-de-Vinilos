package controlador;

import modelo.ColeccionVinilos;
import modelo.Vinilo;
import vista.VistaConsola;

// Control modelo-vista

public class ControladorColeccion {
    private final ColeccionVinilos coleccion;
    private final VistaConsola vista;

    public ControladorColeccion(ColeccionVinilos coleccion, VistaConsola vista) {
        this.coleccion = coleccion;
        this.vista = vista;
    }


    public void agregarVinilo(String artista, String nombreDisco, String ano) {
        try {
            Vinilo vinilo = new Vinilo(artista, nombreDisco, ano);
            boolean agregado = coleccion.agregarVinilo(vinilo);

            if (agregado) {
                vista.mostrarMensaje("Vinilo agregado exitosamente.");
            } else {
                vista.mostrarError("No se pudo agregar. Colección llena.");
            }
        } catch (IllegalArgumentException e) {
            vista.mostrarError(e.getMessage());
        }
    }


    public void buscarArtista(String artista) {
        boolean encontrado = coleccion.contieneArtista(artista);
        vista.mostrarResultadoBusqueda(artista, encontrado);
    }


    public void mostrarResumen() {
        vista.mostrarEncabezado(coleccion.getCapacidadMaxima());
        vista.mostrarTotalVinilos(coleccion.getTotalVinilos());
        vista.mostrarEspaciosDisponibles(coleccion.getEspaciosDisponibles());
    }


    public void mostrarTodosLosVinilos() {
        vista.mostrarListaVinilos(coleccion.obtenerVinilos());
    }


    public void cargarDatosDePrueba() {
        agregarVinilo("Iron Maiden", "Iron Maiden", "1980");
        agregarVinilo("Iron Maiden", "Killers", "1981");
        agregarVinilo("Iron Maiden", "The number of the beast", "1982");
        agregarVinilo("AC-DC", "Back in black", "1980");
        agregarVinilo("AC-DC", "Highway to hell", "1979");
        agregarVinilo("AC-DC", "Who made who", "1986");
        agregarVinilo("Judas Priest", "British steel", "1980");
        agregarVinilo("Judas Priest", "Painkiller", "1990");
        agregarVinilo("Judas Priest", "Defenders of the faith", "1984");
        agregarVinilo("Kiss", "Destroyer", "1976");
    }

    /**
     * Ejecuta el flujo principal de la aplicación.
     */
    public void ejecutar() {
        // Cargar datos de prueba
        cargarDatosDePrueba();

        // Mostrar información
        mostrarResumen();

        // Buscar artista específico
        buscarArtista("AC-DC");

        // Mostrar lista completa
        mostrarTodosLosVinilos();
    }
}