
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getNro_doc() {
        return nro_doc;
    }

    public void setNro_doc(String nro_doc) {
        this.nro_doc = nro_doc;
    }

    public String getNv_socioec() {
        return nv_socioec;
    }

    public void setNv_socioec(String nv_socioec) {
        this.nv_socioec = nv_socioec;
    }

    public String getTipo_beca() {
        return tipo_beca;
    }

    public void setTipo_beca(String tipo_beca) {
        this.tipo_beca = tipo_beca;
    }
    
}
