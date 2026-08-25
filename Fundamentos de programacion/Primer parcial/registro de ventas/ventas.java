import java.util.Scanner;

public class ventas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String venta;
        int mont1 = 0;
        int mont2 = 0;
        int mont3 = 0;
        int monto = 0;
        int total = 0;

        System.out.println("¿se va a realizar una venta?");
        System.out.println("s/n");
        venta = scanner.next();

        // Si la respuesta inicial es 'n', el bucle no se ejecuta
        if (!venta.equalsIgnoreCase("n")) {
            do {
                System.out.println("Ingrese el monto de la venta");
                monto = scanner.nextInt();

                total += monto;

                if (monto > 1000) {
                    mont1++;
                }
                if (monto > 500 && monto <= 1000) {
                    mont2++;
                }
                if (monto <= 500) { // Incluye montos menores o iguales a 500
                    mont3++;
                }

                System.out.println("¿se va a realizar una venta?");
                System.out.println("s/n");
                venta = scanner.next();

            } while (!venta.equalsIgnoreCase("n"));
        }

        System.out.println("la venta total del dia fue de : " + total);
        System.out.println("La cantidad de ventas mayores a 1000 fue: " + mont1);
        System.out.println("La cantidad de ventas entre 1000 y 500 fue: " + mont2);
        System.out.println("La cantidad de ventas menores de 500 fue: " + mont3);

        scanner.close();
    }
}