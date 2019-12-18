package Logica;

import DTO.DatoValidado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gonzalo
 */
public class Logica {
    
    private static List<DatoValidado> listaDatos = new ArrayList<>();
    
    public static void addDato(DatoValidado dato) {
        listaDatos.add(dato);
    }

    public static List<DatoValidado> getListaDatos() {
        return listaDatos;
    }
}
