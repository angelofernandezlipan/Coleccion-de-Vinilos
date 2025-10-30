package launcher;

import controlador.ControladorColeccion;
import modelo.ColeccionVinilos;
import vista.VistaConsola;

public class Main {

    public static void main(String[] args) {

        ColeccionVinilos coleccion = new ColeccionVinilos(100);

        VistaConsola vista = new VistaConsola();

        ControladorColeccion controlador = new ControladorColeccion(coleccion, vista);

        controlador.ejecutar();
    }
}