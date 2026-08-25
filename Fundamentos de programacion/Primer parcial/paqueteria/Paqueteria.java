import java.util.Scanner;

public class Paqueteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en kg: ");
        double pesoKg = sc.nextDouble();

        if (pesoKg > 5.0) {
            System.out.println("El paquete es RECHAZADO por exceder los 5 kg de límite.");
        } else {
            System.out.print("Ingrese la zona de destino (1 a 5): ");
            int zona = sc.nextInt();
            double costoGramo = 0;

            switch (zona) {
                case 1: costoGramo = 11; break;
                case 2: costoGramo = 10; break;
                case 3: costoGramo = 12; break;
                case 4: costoGramo = 25; break;
                case 5: costoGramo = 30; break;
                default: System.out.println("Zona inválida."); return;
            }

            double pesoGramos = pesoKg * 1000;
            double cobroTotal = pesoGramos * costoGramo;
            System.out.printf("El costo total de entrega es: $" + cobroTotal);
        }
        sc.close();
    }
}