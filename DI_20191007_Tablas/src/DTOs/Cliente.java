package DTOs;

/**
 *
 * @author Gonzalo
 */
public class Cliente {
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String DNI;

    public Cliente(String nombre, String apellido1, String apellido2, String DNI) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.DNI = DNI;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", DNI=" + DNI + '}';
    }
    
    public String[] clienteArray(){
        String[] contacto = new String[4];
        contacto[0] = nombre;
        contacto[1] = apellido1;        
        contacto[2] = apellido2;
        contacto[3] = DNI;
        return contacto;
    }
    
}
