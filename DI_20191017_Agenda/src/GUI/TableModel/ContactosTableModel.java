/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.TableModel;

import DTO.Contacto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gonzalo
 */
public class ContactosTableModel extends AbstractTableModel {

    private List<Contacto> contactos;
    private String[] cabecera = {"Nombre", "Apellidos", "DNI"};

    public ContactosTableModel(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    @Override
    public int getRowCount() {
        return contactos.size();
    }

    @Override
    public int getColumnCount() {
        return cabecera.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return contactos.get(rowIndex).getNombre();
            case 1:
                return contactos.get(rowIndex).getApellidos();
            case 2:
                return contactos.get(rowIndex).getDni();
        }
        return null;
    }

    @Override
    public String getColumnName(int i) {
        return cabecera[i];
    }

    public void deleteRow(int row) {
        if (!(contactos.size() == 0)) {
            contactos.remove(row);
        }
        fireTableDataChanged();
    }

    public void refrescar() {
        fireTableDataChanged();
    }

}
