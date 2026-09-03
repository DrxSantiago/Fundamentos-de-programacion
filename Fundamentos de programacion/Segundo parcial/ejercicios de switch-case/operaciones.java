package casos_switch;
import java.util.Scanner;

public class operaciones {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Ingrese otro numero: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Ingrese un operador (+, -, *, /): ");
		char operador = sc.next().charAt(0);
		
		switch (operador) {
		case '+':
			System.out.println("El resultado es: "+ (num1 + num2));
			break;
		case '-':
			System.out.println("El resultado es: "+ (num1 - num2));
			break;
		case '*':
			System.out.println("El resukltado es: "+ (num1 * num2));
			break;
		case '/':
			if (num2 != 0) {
                double resultado = (double) num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Error: División por cero no permitida.");
            }
            break;
        default:
            System.out.println("Error: Operador no válido. Utiliza +, -, * o /.");
            break;
		}
		sc.close();
	}

}
