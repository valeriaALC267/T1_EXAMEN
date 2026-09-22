
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

    public void setNombre(String nombre) 
    {
        if(nombre == null || nombre.isEmpty())
        {
            throw new IllegalArgumentException("Ups! Debe llenar este campo primero, por favor.");
        }
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p)
    {
         if(apellido_p== null || apellido_p.isEmpty())
        {
            throw new IllegalArgumentException("Ups! Debe llenar este campo primero, por favor.");
        }
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m)
    {
         if(apellido_m == null || apellido_m.isEmpty())
        {
            throw new IllegalArgumentException("Ups! Debe llenar este campo primero, por favor.");
        }
        this.apellido_m = apellido_m;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) 
    {
         if(tipo_doc == null || tipo_doc.isEmpty())
        {
            throw new IllegalArgumentException("Ups! Debe llenar este campo primero, por favor.");
        }
         if(!tipo_doc.equalsIgnoreCase("dni") && !tipo_doc.equalsIgnoreCase("cr"))
         {
             throw new IllegalArgumentException("Ups! Este tipo de documento no es valido. Intente de nuevo, por favor");
         }
        this.tipo_doc = tipo_doc;
    }

    public String getNro_doc() {
        return nro_doc;
    }

    public void setNro_doc(String nro_doc) 
    {
        if(nro_doc == null || nro_doc.isEmpty())
        {
            throw new IllegalArgumentException("Ups! Debe llenar este campo primero, por favor.");
        }
        if(nro_doc.length() != 8 && this.tipo_doc.equalsIgnoreCase("dni"))
        {
            throw new IllegalArgumentException("Ups! El DNI debe tener 8 digitos. Intente de nuevo, por favor.");
        }
        else if(nro_doc.length() != 11 && this.tipo_doc.equalsIgnoreCase("cr"))
        {
            throw new IllegalArgumentException("Ups! El Carnet de residencia temporal debe tener 11 digitos. Intente de nuevo, por favor.");
        }
        this.nro_doc = nro_doc;
    }

    public String getNv_socioec() 
    {
        
        return nv_socioec;
    }

    public void setNv_socioec(String nv_socioec)
    {
        if(nv_socioec == null || nv_socioec.isEmpty())
        {
            throw new IllegalArgumentException("Ups! Debe llenar este campo primero, por favor.");
        }
        if(!nv_socioec.equalsIgnoreCase("A") && !nv_socioec.equalsIgnoreCase("B")&& !nv_socioec.equalsIgnoreCase("C"))
        {
            throw new IllegalArgumentException("Ups! Este tipo se nivel socioeconomico no es valido. Intente de nuevo, por favor.");
        }
        this.nv_socioec = nv_socioec;
    }

    public String getTipo_beca() {
        return tipo_beca;
    }

    public void setTipo_beca(String tipo_beca)
    {
        if(tipo_beca == null || tipo_beca.isEmpty())
        {
            throw new IllegalArgumentException("Ups! Debe llenar este campo primero, por favor.");
        }
        if(!tipo_beca.equalsIgnoreCase("total") && !tipo_beca.equalsIgnoreCase("parcial"))
        {
            throw new IllegalArgumentException("Ups! Este tipo de beca no es valido. Intente de nuevo, por favor");
        }
        this.tipo_beca = tipo_beca;
    }
    
}
