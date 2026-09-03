package casos_switch;
import java.util.Scanner;

public class boletoscine {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número de personas: ");
        int personas = sc.nextInt();

        System.out.println("Días de la semana:");
        System.out.println("1. Lunes | 2. Martes | 3. Miércoles | 4. Jueves | 5. Viernes | 6. Sábado | 7. Domingo");
        System.out.print("Selecciona el número de día (1-7): ");
        int dia = sc.nextInt();

        System.out.print("¿Cuentas con membresía? (true/false): ");
        boolean tieneMembresia = sc.nextBoolean();

        double totalSinDescuento = 0;

        switch (dia) {
            case 3:
                totalSinDescuento = personas * 30.0;
                break;

            case 4:
                int parejas = personas / 2;
                int individuales = personas % 2;
                totalSinDescuento = (parejas * 75.0) + (individuales * 50.0);
                break;

            case 1: case 2: case 5: case 6: case 7:
                totalSinDescuento = personas * 50.0;
                break;

            default:
                System.out.println("Día no válido.");
                sc.close();
                return;
        }

        double totalFinal = totalSinDescuento;
        if (tieneMembresia) {
            totalFinal = totalSinDescuento * 0.90;
        }

        System.out.println("----------------------------------------");
        System.out.println("Subtotal: $" + totalSinDescuento + " pesos");
        if (tieneMembresia) {
            System.out.println("Descuento de membresía aplicado (10%)");
        }
        System.out.println("Total a pagar: $" + totalFinal + " pesos");

        sc.close();
    }

}
