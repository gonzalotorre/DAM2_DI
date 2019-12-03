package DTO;

/**
 *
 * @author Gonzalo
 */
public class Contacto {
    
    private String nombre;
    private String apellidos;
    private String dni;

    public Contacto(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public Contacto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    /*public String[] contactoString(){
        String[] contacto = new String[3];
        contacto[0] = nombre;
        contacto[1] = apellidos;
        contacto[2] = dni;
        return contacto;
    }*/
    
}
