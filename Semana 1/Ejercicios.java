//import java.util.*;

/*** 
    Autor: Roberto Rico Sandoval.
    Fille: Datos primitivos.
    Date: 20/ 10/ 2023
***/

public class Ejercicios{
    
   public static void main(String args[]){
    
    
    // Valores primitivos en variables locales.   
    int a, b, operacion1;
    
    double operacion2 = 15.52;
    float operacion3 = 156.96f;
    
    String nombre = "Roberto";
    String apellido = "Sandoval";
    
    char sexo = 'M';
    
    boolean verdadero = true;
    boolean falso = false;
    
    
    a = 10;
    b = 5;
    operacion1 = 12;
    
    //Conversión de dato.
    double nuevaOperacion3 = operacion2 + operacion3;
    
    // Creación de constante.
    final int maxEdad = 29;
    //maxEdad = 31; Ejecución de error.
    
    System.out.println("El valor de la suma es: " + (a + b));
    
    System.out.println(nombre);
    System.out.println(apellido);
    
    System.out.println("Mi nombre es: " + nombre + " " + apellido);
    
    System.out.println("Mi sexo es: " + sexo);
    
    System.out.println(operacion1);
    System.out.println(operacion1 + operacion2);
    
    System.out.println(nuevaOperacion3);
    
    System.out.println(verdadero);
    System.out.println(falso);
    System.out.println("Solo existen dos valores boleános.");
    
    
    /*** 
    class Ejemplo {
        data = 99;
    }
    
    Falta el valor Public.
    ***/
    
    System.out.println(maxEdad);
  }
  
}
