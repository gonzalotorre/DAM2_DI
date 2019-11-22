package Ejercicio2;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Gonzalo
 */
public class ComponenteEjemplo2 extends JTextField implements Serializable {

    private ClaseDosColores colores;
    private int numCaracteres;

    public ComponenteEjemplo2() {
        super();
        super.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                analizaContenido();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                analizaContenido();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                analizaContenido();
            }

            private void analizaContenido() {
                if (getText().length() >= numCaracteres) {
                    setBackground(colores.getColorFondo());
                } else {
                    setBackground(Color.GRAY);
                }
            }
        });
    }

    public ClaseDosColores getColores() {
        return colores;
    }

    public void setColores(ClaseDosColores colores) {
        this.colores = colores;
    }

    public int getNumCaracteres() {
        return numCaracteres;
    }

    public void setNumCaracteres(int numCaracteres) {
        this.numCaracteres = numCaracteres;
    }

}
