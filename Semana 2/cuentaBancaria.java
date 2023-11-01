/* 
 * Autor: Roberto Rico Sandoval.
 * Fille: Operadores.
*/

public class cuentaBancaria {
    public static void main(String[] args) {
        
        double saldo = 1000.75;
        double cantidadARetirar= 250;

        double saldoActualizado = (saldo - cantidadARetirar);

        // Se divide la cantidad del saldo actualizado entre 3 amigos.
        double cantidadParaCadaAmigo = (saldoActualizado / 3);

        System.out.println("\nSaldo actual: " + saldo + "\nRetiro de saldo: " + cantidadARetirar);
        System.out.println("\nSaldo actualizado: " + saldoActualizado);
        System.out.println("\nCantidad de dinero para cada amigo: " + cantidadParaCadaAmigo);

        // El precio del boleto para el concienrto cuesta $250.0
        if(cantidadParaCadaAmigo >= 250){

            System.out.println("\nCuentas con el suficiente dinero para comprar un boleto para el concierto.");
        }
        else{

            System.out.println("\nNo cuentas con el suficiente dinero para comprar un boleto para el concierto.");
        }
    }
}

