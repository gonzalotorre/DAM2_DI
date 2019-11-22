package Ejercicio2;

import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Gonzalo
 */
public class ColoresPropertyEditorSupport extends PropertyEditorSupport {

    private JPanelDatosColores coloresPanel = new JPanelDatosColores();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return coloresPanel;
    }

    @Override
    public Object getValue() {
        return coloresPanel.getPropiedadSeleccionada();
    }

    @Override
    public String getJavaInitializationString() {

        Color colorFondo = coloresPanel.getPropiedadSeleccionada().getColorFondo();
        Color colorTexto = coloresPanel.getPropiedadSeleccionada().getColorTexto();
        return "new Ejercicio2.ClaseDosColores(new java.awt.Color("
                + colorFondo.getRGB() + "),new java.awt.Color(" + colorTexto.getRGB() + "))";
    } 

}
