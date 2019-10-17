package Agenda.GUI.TableModel;

import Agenda.DTO.IngresoGasto;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gonzalo
 */
public class IngresoGastoTableModel extends AbstractTableModel {

    private List<IngresoGasto> ingresosGastos = null;
    private String[] cabecera = {"Fecha", "Concepto", "Ingreso"};

    public IngresoGastoTableModel(List<IngresoGasto> ingresosGastos) {
        this.ingresosGastos = ingresosGastos;
    }

    @Override
    public int getRowCount() {
        return ingresosGastos.size();
    }

    @Override
    public int getColumnCount() {
        return cabecera.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return ingresosGastos.get(rowIndex).getFecha();
            case 1:
                return ingresosGastos.get(rowIndex).getConcepto();
            case 2:
                //Poniendo #0.00# --> muestra el numero: 1,00
                //Poniendo ##,##0.00# --> muestra el numero 1.000,00
                //La almoadilla pone los numeros y si no se introduce no pone nada
                //Si se pusiera #0,000,000.00# si no se mete ningún valor, pondría 0.000.000,00
                return new DecimalFormat("##,##0.00#").format(ingresosGastos.get(rowIndex).getIngreso());
        }
        return null;
    }

    @Override
    public String getColumnName(int i) {
        return cabecera[i];
    }
    
    public void borrarFila(int fila){
        if(!(ingresosGastos.size() == 0)){
            ingresosGastos.remove(fila);
            fireTableDataChanged();
        }
    }

    public void refrescarArray() {
        fireTableDataChanged();
    }

}
