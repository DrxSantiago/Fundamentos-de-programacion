import java.util.Scanner;

public class ConsultorioMedico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de cita: ");
        int numCita = sc.nextInt();

        double costoCita;
        double montoTratamiento;

        if (numCita <= 3) {
            costoCita = 900;
            montoTratamiento = numCita * 900;
        } else if (numCita <= 5) {
            costoCita = 800;
            montoTratamiento = 2700 + ((numCita - 3) * 800);
        } else if (numCita <= 8) {
            costoCita = 600;
            montoTratamiento = 4300 + ((numCita - 5) * 600);
        } else {
            costoCita = 500;
            montoTratamiento = 6100 + ((numCita - 8) * 500);
        }

        System.out.printf("Costo de esta cita: $%.2f%n", costoCita);
        System.out.printf("Monto total pagado por el tratamiento: $%.2f%n", montoTratamiento);
        sc.close();
    }
}