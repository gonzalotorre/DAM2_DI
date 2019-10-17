package Agenda.DTO;

/**
 *
 * @author Gonzalo
 */
public class IngresoGasto {

    private String fecha;
    private String concepto;
    private double ingreso;

    public IngresoGasto(String fecha, String concepto, double ingreso) {
        this.fecha = fecha;
        this.concepto = concepto;
        this.ingreso = ingreso;
    }

    public IngresoGasto() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }
    
    public String[] ingresoGastoArray(){
        String[] ingresoGasto = new String[3];
        ingresoGasto[0] = fecha;
        ingresoGasto[1] = concepto;
        ingresoGasto[2] = Double.toString(ingreso);
        return ingresoGasto;
    }
    
}
