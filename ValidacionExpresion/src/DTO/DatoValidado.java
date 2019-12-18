package DTO;

import java.util.Date;

/**
 *
 * @author Gonzalo
 */
public class DatoValidado {
    
    private Date fecha;
    private String hora;
    private String cadena;

    public DatoValidado(Date fecha, String hora, String cadena) {
        this.fecha = fecha;
        this.hora = hora;
        this.cadena = cadena;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    
    
}
