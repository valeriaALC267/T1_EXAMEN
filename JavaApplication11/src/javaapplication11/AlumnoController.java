
package javaapplication11;

import java.util.ArrayList;


public class AlumnoController 
{
    ArrayList<Alumno> listaAlumnos;
    public AlumnoController()
    {
        listaAlumnos = new ArrayList<>();
    }
    public Boolean VerDuplicados(String doc)
    {
        for(int i = 0; i<listaAlumnos.size(); i++)
        {
            if(doc.equalsIgnoreCase(listaAlumnos.get(i).getNro_doc()))
            {
                return true;
            }
        }
        return false;
    }
    public void Agregar(Alumno a)
    {
        if(VerDuplicados(a.getNro_doc()))
        {
            System.out.println("Ups! No se puede registrar a este alumno. Ya existe uno con el mismo numero de documento");
        }
        else
        {
          listaAlumnos.add(a);
            System.out.println("Alumno registrado exitosamente!");
        }
    }
    public void Listar()
    {
        for(Alumno a : listaAlumnos)
        {
            System.out.println(a.MostrarDatos());
        }
    }
}
