//import java.util.*;

/*** 
    Autor: Roberto Rico Sandoval.
    Fille: Datos primitivos.
    Date: 20/ 10/ 2023
***/

public class Datos_primitivos{
    
   public static void main(String args[]){
       
     int a = 4;     // TIpo de dato entero.
     
     float b = 2.25f;   // Tipo de dato flotante.
     
     double c = 4.8;    // Tipo de dato double.
     
     boolean d = false; // Tipo de dato boleáno.
     
     char e = 'A';  // Tipo de dato carácter.
     
     float a1 = a;
     
     double a2 = a1;
     
     // Impresión de valores.
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);
     System.out.println(d);
     System.out.println(e);
     
     //Operaciones de datos numéricos.
     System.out.println(a/b);
     System.out.println(b/a);
     System.out.println(a/c);
     System.out.println(c/a);
     System.out.println(b/c);
     System.out.println(c/b);
     
     System.out.println(a1);
     System.out.println(a2);
     
     
     // System.out.println(a2); Solo se puede realizar la conversión (Cast), cuando el tamaño es más grande que el dato a convertir.
  }
  
}

