package casos_con_ciclos;
import java.util.Scanner;

public class boletos_cine {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa el número de personas: ");
    int personas = sc.nextInt();

    int dia = 0;
    while (dia < 1 || dia > 7) {
        System.out.println("Selecciona el día (1.Lun | 2.Mar | 3.Mié | 4.Jue | 5.Vie | 6.Sáb | 7.Dom): ");
        dia = sc.nextInt();
    }

    System.out.print("¿Cuentas con membresía? (true/false): ");
    boolean tieneMembresia = sc.nextBoolean();

    double totalSinDescuento = 0;

  
    if (dia == 4) { 
        for (int i = 1; i <= personas; i++) {
            if (i % 2 == 0) {
                totalSinDescuento += 25.0; 
            } else {
                totalSinDescuento += 50.0; 
            }
        }
    } else if (dia == 3) {
        for (int i = 1; i <= personas; i++) {
            totalSinDescuento += 30.0;
        }
    } else { 
        for (int i = 1; i <= personas; i++) {
            totalSinDescuento += 50.0;
        }
    }

    double totalFinal = tieneMembresia ? totalSinDescuento * 0.90 : totalSinDescuento;

    System.out.println("\n----------------------------------------");
    System.out.println("Subtotal: $" + totalSinDescuento + " pesos");
    if (tieneMembresia) System.out.println("Descuento de membresía aplicado (10%)");
    System.out.println("Total a pagar: $" + totalFinal + " pesos");

    sc.close();
	}

}
