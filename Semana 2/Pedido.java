/* 
 * Autor: Roberto Rico Sandoval.
 * Fille: Series y condicionales.
*/

public class Pedido {
    public static void main(String[] args) {
        
        double costoArticulo = 30.99;

        boolean listoEviar = false;

        // Sí el artículo cuesta más que $24, entonces, es un artículo costoso.
        if(costoArticulo > 24){

            System.out.println("\nEl artículo seleccionado es costoso.\nCosto del artículo actual: $" + costoArticulo);
        }
        else{

            System.out.println("\nEl artículo seleccionado NO es costoso." + "\nCosto del artículo actual: $" + costoArticulo);
        }

        // Valores de activación de la variable booleana listoEnviar.
        if(listoEviar){

            System.out.println("\nEnviado.");
        }
        else if(listoEviar == false){

            System.out.println("\nPedido no listo.");
        }
    }
}
