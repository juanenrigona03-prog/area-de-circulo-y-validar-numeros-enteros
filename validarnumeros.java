import java.util.Scanner;


// Clase para validar numeros
class ValidarNumero {

    double numero;

    // Metodo para validar si es entero
    public boolean esEntero() {
        return numero % 1 == 0;
    }
}

// Clase principal
public class  validarnumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Crear objeto
        ValidarNumero validar = new ValidarNumero();

        // Pedir numero
        System.out.print("Ingresa un numero: ");
        validar.numero = entrada.nextDouble();

        // Validar numero
        if (validar.esEntero()) {
            System.out.println("El numero es entero.");
        } else {
            System.out.println("El numero no es entero.");
        }

        entrada.close();
    }
}



