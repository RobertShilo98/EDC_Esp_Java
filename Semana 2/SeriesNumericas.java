/* 
 * Autor: Roberto Rico Sandoval.
 * Fille: Series y condicionales.
*/

public class SeriesNumericas {
    public static void main(String[] args) {
        
        // Serie numérica simple.
        for(int i = 1; i <= 15; i++){

            System.out.println("Valor de i: " + i);
        }
        

        // Serie numérica de números impares positivos.
        int j = 1;

        while(j <= 15){

            if(j % 2 != 0){

                System.out.println("Valor de j = " + j);
            }

            j++;

        }
        

        // Serie numérica de números Fibonacci.
        int i = 1, rangos = 15, num1 = 0, num2 = 1;

        System.out.println("\nSerie Fibonacci que no supera el número 15.\n");

        while (i <= rangos){

	        if(num1 <= 15){

                System.out.print (num1 + ", ");
            }

	        int numActual = num1 + num2;

	        num1 = num2;
	        num2 = numActual ;

	        i++;

        }
    }
}

