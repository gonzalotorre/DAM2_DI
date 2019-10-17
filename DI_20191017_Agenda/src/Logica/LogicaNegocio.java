package Logica;

import DTO.Contacto;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public class LogicaNegocio {

    private static List<Contacto> listaContactos = new ArrayList<>();

    public static void addContacto(Contacto c) {
        listaContactos.add(c);
    }

    public static List<Contacto> getListaContactos() {
        return listaContactos;
    }
}
