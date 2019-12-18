package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author Gonzalo
 */
public class JButtonCambiante extends JButton implements Serializable {

    private Color colorInicial;
    private Color colorAlPasar;
    private Font fuenteInicial;
    private Font fuenteAlPasar;

    public JButtonCambiante() {
        super.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (colorAlPasar != null && fuenteAlPasar != null) {
                    setForeground(colorAlPasar);
                    setFont(fuenteAlPasar);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if (colorInicial != null && fuenteInicial != null) {
                    setForeground(colorInicial);
                    setFont(fuenteInicial);
                }
            }
        });
    }

    public Color getColorInicial() {
        return colorInicial;
    }

    public void setColorInicial(Color colorInicial) {
        setForeground(colorInicial);
        this.colorInicial = colorInicial;
    }

    public Color getColorAlPasar() {
        return colorAlPasar;
    }

    public void setColorAlPasar(Color colorAlPasar) {
        this.colorAlPasar = colorAlPasar;
    }

    public Font getFuenteInicial() {
        return fuenteInicial;
    }

    public void setFuenteInicial(Font fuenteInicial) {
        setFont(fuenteInicial);
        this.fuenteInicial = fuenteInicial;
    }

    public Font getFuenteAlPasar() {
        return fuenteAlPasar;
    }

    public void setFuenteAlPasar(Font fuenteAlPasar) {
        this.fuenteAlPasar = fuenteAlPasar;
    }

}
