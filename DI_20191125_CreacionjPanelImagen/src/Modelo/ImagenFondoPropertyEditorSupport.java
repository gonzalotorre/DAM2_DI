/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Gonzalo
 */
public class ImagenFondoPropertyEditorSupport extends PropertyEditorSupport {

    ImagenFondoJPanel imagenFondoJPanel = new ImagenFondoJPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return imagenFondoJPanel;
    }

    @Override
    public String getJavaInitializationString() {
        ImagenFondo imagenFondo = imagenFondoJPanel.getValoresSeleccionados();
        return "new Modelo.ImagenFondo(" + "new java.io.File(\""
                + imagenFondo.getRutaImagen().getAbsolutePath().replace("\\","\\\\")
                + "\"), " + imagenFondo.getOpacidad() + "f)";
    }

    @Override
    public Object getValue() {
        return imagenFondoJPanel.getValoresSeleccionados();
    }

}
