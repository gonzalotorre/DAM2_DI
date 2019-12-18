package GUI;

import GUI.TableModel.ExpresionTableModel;
import Logica.Logica;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Gonzalo
 */
public class JDialogTablaExpresionCorrecta extends javax.swing.JDialog {

    /**
     * Creates new form JDialogTablaExpresionCorrecta
     */
    public JDialogTablaExpresionCorrecta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //centrar ventana en la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize(); //recuperamos tamaño pantalla
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width / 2, height / 2);
        setLocationRelativeTo(null);
        
        jTableDatos.setModel(new ExpresionTableModel(Logica.getListaDatos()));
        iniciarTabla();
        try {
            File fichero = new File("help" + File.separator + "help_set.hs");
            URL hsURL = fichero.toURI().toURL();
            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();
            // Pone ayuda a item de menu al pulsarlo.
            hb.enableHelpKey(getRootPane(), "lista", helpset);
        } catch (MalformedURLException ex) {
            Logger.getLogger(JFrameVentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HelpSetException ex) {
            Logger.getLogger(JFrameVentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*private void cambiarLookAndFeel(){
        try { 
            UIManager.setLookAndFeel(EaSynthLookAndFeel.class.getCanonicalName());
            SwingUtilities.updateComponentTreeUI(this);            
        } catch (Throwable ex) {
            JOptionPane.showInternalMessageDialog(this, "Error al establecer LookAndFeel","Error",JOptionPane.ERROR_MESSAGE);
        }
    }*/
    
    private void iniciarTabla() {
        ExpresionTableModel ftm = new ExpresionTableModel(Logica.getListaDatos());
        jTableDatos.setModel(ftm);
        //Para poder ordenar la tabla
        TableRowSorter<ExpresionTableModel> sorter = new TableRowSorter<>(ftm);
        jTableDatos.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTableDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}
