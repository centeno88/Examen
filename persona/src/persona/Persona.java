/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Alumno
 */
public class Persona {
    String numeroDeTelefono;
    
   public Persona (string numeroDeTelefono){
       super();
       this.numeroDeTelefono=numeroDeTelefono;
   }
   public String getNumeroDeTelefono(){
       return numeroDeTelefono;
   }
            public void setNumeroDeTelefono (String numeroDeTelefono){
                this.numeroDeTelefono=numeroDeTelefono;
            }
            public class Profesor extends Persona{
                String srt;
                int edad;
                String numeroDeTelefono;
                list<Prestamo>prestamos;
                
                public Profesor (string numeroDeTelefono){
                    super(numeroDeTelefono);
                }
            public void printInformacionPersonal(){
                System.out.println ("Nombre: "+ srt);
                System.out.println ("Edad: "+ edad);
                System.out.println ("telefono: "+ this.numeroDeTelefono);
            }
            public void printTodaInformacion(){
                System.out.println ("Nombre: "+ srt);
                System.out.println ("Edad: "+ edad);
                System.out.println ("telefono: "+ this.numeroDeTelefono);
                for (Prestamo p: prestamos){
                    System.out.println(p);
                }
            }
           }
}
   
