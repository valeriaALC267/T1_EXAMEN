
package javaapplication11;


public class AlumnoController 
{
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private String tipo_doc;
    private String nro_doc;
    private String nv_socioec;
    private String tipo_beca;

    public AlumnoController() {
    }

    public AlumnoController(String nombre, String apellido_p, String apellido_m, String tipo_doc, String nro_doc, String nv_socioec, String tipo_beca) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.tipo_doc = tipo_doc;
        this.nro_doc = nro_doc;
        this.nv_socioec = nv_socioec;
        this.tipo_beca = tipo_beca;
    }
    
}
