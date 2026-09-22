
package javaapplication11;

import java.util.Scanner;


public class JavaApplication11 {

    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        AlumnoController ac = new AlumnoController();
        String r;
        
        do 
        {            
            System.out.println("------------------REGISTRO DE ALUMNOS ISTITUTO INNOVA-----------------------");
            Alumno a = new Alumno();
            Boolean n = false;
            while(!n)
            {
                try 
                {
                    System.out.println("Nombre:");
                    a.setNombre(teclado.nextLine());
                    n = true;
                } 
                catch (IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            
            Boolean ap = false;
            while(!ap)
            {
                try 
                {
                    System.out.println("Apellido Paterno:");
                    a.setApellido_p(teclado.nextLine());
                    ap = true;
                } 
                catch (IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            
            Boolean am = false;
            while(!am)
            {
                try 
                {
                    System.out.println("Apellido Materno:");
                    a.setApellido_m(teclado.nextLine());
                    am = true;
                } 
                catch (IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            
            Boolean td = false;
            while(!td)
            {
                try 
                {
                    System.out.println("Tipo Documento:");
                    a.setTipo_doc(teclado.nextLine());
                    td = true;
                } 
                catch (IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            
            Boolean nd = false;
            while(!nd)
            {
                try 
                {
                    System.out.println("Numero Documento:");
                    a.setNro_doc(teclado.nextLine());
                    nd = true;
                } 
                catch (IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            
            Boolean nv = false;
            while(!nv)
            {
                try 
                {
                    System.out.println("Nivel Socioeconomico (A/B/C):");
                    a.setNv_socioec(teclado.nextLine());
                    nv = true;
                } 
                catch (IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            
            Boolean b = false;
            while(!b)
            {
                try 
                {
                    System.out.println("Tipo beca (total/parcial/ninguna):");
                    a.setTipo_beca(teclado.nextLine());
                    b = true;
                } 
                catch (IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            ac.Agregar(a);
            System.out.println(a.MostrarDatos());
            double p = a.CalcularPension();
            System.out.println("-TOTAL PENSION-");
            System.out.println(p);
            System.out.println("Desea registrar otro alumno? (s/n)");
            r = teclado.nextLine();
        } while (r.equalsIgnoreCase("s"));
        
        ac.Listar();
    }
    
}
