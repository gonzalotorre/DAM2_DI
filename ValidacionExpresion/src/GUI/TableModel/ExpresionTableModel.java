package GUI.TableModel;

import DTO.DatoValidado;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gonzalo
 */
public class ExpresionTableModel extends AbstractTableModel {

    private List<DatoValidado> datos;
    private String[] cabecera = {"Fecha", "Hora", "Operacion"};

    public ExpresionTableModel(List<DatoValidado> datos) {
        this.datos = datos;
    }
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return cabecera.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
                return formateador.format(datos.get(rowIndex).getFecha());
            case 1:
                return datos.get(rowIndex).getHora();
            case 2:
                return datos.get(rowIndex).getCadena();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int i) {
        return cabecera[i];
    }

    public void deleteRow(int row) {
        if (!(datos.size() == 0)) {
            datos.remove(row);
        }
        fireTableDataChanged();
    }

    public void refrescar() {
        fireTableDataChanged();
    }
    
}
