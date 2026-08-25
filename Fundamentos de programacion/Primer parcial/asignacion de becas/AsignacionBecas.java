import java.util.Scanner;

public class AsignacionBecas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad del alumno: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese el promedio del alumno: ");
        double promedio = sc.nextDouble();

        if (edad > 18) {
            if (promedio >= 9.0) {
                System.out.println("Beca asignada: $10,000.00");
            } else if (promedio >= 7.5) {
                System.out.println("Beca asignada: $8,000.00");
            } else if (promedio >= 6.0) {
                System.out.println("Beca asignada: $5,000.00");
            } else {
                System.out.println("Se le enviará una carta de invitación para estudiar más el próximo ciclo.");
            }
        } else {
            if (promedio >= 9.0) {
                System.out.println("Beca asignada: $8,000.00");
            } else if (promedio >= 8.0) {
                System.out.println("Beca asignada: $6,000.00");
            } else if (promedio >= 6.0) {
                System.out.println("Beca asignada: $4,000.00");
            } else {
                System.out.println("Se le enviará una carta de invitación para estudiar más el próximo ciclo.");
            }
        }
        sc.close();
    }
}