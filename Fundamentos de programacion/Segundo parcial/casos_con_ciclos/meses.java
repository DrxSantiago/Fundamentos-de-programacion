package casos_con_ciclos;
import java.util.Scanner;

public class meses {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            int mes = 0;

            while (mes < 1 || mes > 12) {
                System.out.print("Ingresa el número del mes (1 a 12): ");
                mes = scanner.nextInt();

                if (mes < 1 || mes > 12) {
                    System.out.println("Error: El mes ingresado no es válido. Debe ser entre 1 y 12.\n");
                }
            }

            switch (mes) {
                case 1:  
                case 3:  
                case 5:  
                case 7:  
                case 8:  
                case 10: 
                case 12: 
                    System.out.println("El mes " + mes + " tiene 31 días.");
                    break;

                case 4:  
                case 6:  
                case 9:  
                case 11: 
                    System.out.println("El mes " + mes + " tiene 30 días.");
                    break;

                case 2: 
                    System.out.print("¿Es un año bisiesto? (true/false): ");
                    boolean esBisiesto = scanner.nextBoolean();

                    if (esBisiesto) {
                        System.out.println("El mes de Febrero tiene 29 días (año bisiesto).");
                    } else {
                        System.out.println("El mes de Febrero tiene 28 días.");
                    }
                    break;
            }

            System.out.print("\n¿Deseas consultar otro mes? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);
            System.out.println();

        } while (continuar == 's');

        System.out.println("Programa finalizado.");
        scanner.close();
	}

}
