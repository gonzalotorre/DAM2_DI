package Agenda.logica;

import Agenda.DTO.IngresoGasto;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public class LogicaNegocio {

    private static List<IngresoGasto> operaciones = new ArrayList<IngresoGasto>();

    public static void anadirIngresoGasto(IngresoGasto ig) {
        operaciones.add(ig);
    }

    public static List<IngresoGasto> getOperaciones() {
        return operaciones;
    }

}
