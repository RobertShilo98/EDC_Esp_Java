/* 
 * Autor: Roberto Rico Sandoval.
 * Fille: Variables y tipos de datos.
*/

public class MiPerfil {
    public static void main(String[] args) {
        
        String nombre = "Roberto Rico Sandoval";
        int edad = 25;
        float salarioDeseado = 9999.99f;
        char genero = 'M';
        boolean buscandoTrabajo = true;

        System.out.println("\n*** Datos del candidato ***");

        System.out.println("\nNombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario deseado mensual: " + salarioDeseado);
        System.out.println("Genero sexual: " + genero);
        System.out.println("¿Actualmente estas buscnado trabajo? - " + buscandoTrabajo);
    }
}

