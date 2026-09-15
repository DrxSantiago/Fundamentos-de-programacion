package casos_con_ciclos;
import java.util.Scanner;

public class operaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("\nIngresa el primer número entero: ");
            int num1 = sc.nextInt();

            System.out.print("Ingresa el segundo número entero: ");
            int num2 = sc.nextInt();

            System.out.print("Ingresa un operador (+, -, *, /): ");
            char operador = sc.next().charAt(0);

            switch (operador) {
                case '+':
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case '/':
                    while (num1 == 0 || num2 == 0) {
                        System.out.print("Error: El divisor no puede ser 0. Ingresa un segundo número válido: ");
                        num2 = sc.nextInt();
                    }
                    double resultado = (double) num1 / num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Error: Operador no válido.");
                    break;
            }

            System.out.print("\n¿Deseas realizar otra operación? (s/n): ");
            continuar = sc.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("Programa finalizado.");
        sc.close();
    }
}