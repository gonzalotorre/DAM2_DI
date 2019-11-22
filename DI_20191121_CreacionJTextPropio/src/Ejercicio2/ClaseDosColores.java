package Ejercicio2;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Gonzalo
 */
public class ClaseDosColores implements Serializable {

    private Color colorFondo;
    private Color colorTexto;

    public ClaseDosColores(Color colorFondo, Color colorTexto) {
        this.colorFondo = colorFondo;
        this.colorTexto = colorTexto;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public Color getColorTexto() {
        return colorTexto;
    }

}
