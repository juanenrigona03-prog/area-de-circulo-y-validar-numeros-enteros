import java.util.Scanner;

// Clase Circulo
class Circulo {

    double radio;

    // Metodo para calcular el area
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase principal
public class area {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Crear objeto
        Circulo miCirculo = new Circulo();

        // Pedir el radio
        System.out.print("Ingresa el radio del circulo: ");
        miCirculo.radio = entrada.nextDouble();

        // Calcular e imprimir el area
        double area = miCirculo.calcularArea();

        System.out.println("El area del circulo es: " + area);

        entrada.close();
    }
}


