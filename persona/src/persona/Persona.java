/*
 
package persona;

/**este codigo define la clase persona y la clase profesor
 *eliminar este segundo parrafo (se me olvido escribirlo inicialmente)
 * el codigo ha sido hecho por carlos hernandez en mayo del 2019
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
   
