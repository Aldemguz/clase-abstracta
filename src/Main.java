/*
 Practicando clase abstractas. de codigo facilito.!
utilizando clase empleado, jefatura.

para un method abstract
    public abstract <tipo> <nombre>(parametros);
    no lleva llaves, no lleva nada en su interior.! solo se define.
    si usas un method abstract tambien debes declarar abstract la clase.
   se declara la clase
    abstract class <nombre>{...};

    al tener un method abstract todas las clases q hereden de esa clase, tienen
    que reescribir el metodo.
    sirven para tener un patron de comportamiento (al obligar a todas las clases-hijs
    a reeescribir y tener ese method (abstracto)

nota: a partir de "clases-nietas" no es necesario sobreescribir el metodo abstract.

 * @author aldemaro

 */
public class Main {

    public static void main(String[] args) {
       Persona [] lasPersonas = new Persona[3];
       lasPersonas[0] = new Empleado("Aldemaro",6000,2018,8,21);
       lasPersonas[1] = new Alumno("Aldemaro","Ing de Sistemas");
       lasPersonas[2] = new Jefatura("Pepe",70000,2016,3,15);
       
       for(Persona e: lasPersonas){
           System.out.println(e.dimeDescripcion());
       }
        
    }
    
}
