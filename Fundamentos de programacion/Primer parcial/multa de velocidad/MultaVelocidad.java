import java.util.Scanner;

public class MultaVelocidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multa=0;

        System.out.print("Ingrese la velocidad del vehículo (km/h): ");
        double velocidad = sc.nextDouble();

        System.out.print("Es su cumpleaños? (s/n): ");
        String esCumpleanos = sc.next();

        if (esCumpleanos.equals("s")) {
            if (velocidad<300) {
                multa = 0;
            } else if (velocidad>=300 && velocidad<=400) {
                multa = 1;
            } else if (velocidad>400) {
                multa = 2;
            }
        } else if (esCumpleanos.equals("n")) {
            if (velocidad <= 60) {
                multa = 0;
            } else if (velocidad>= 61 && velocidad<=80) {
                multa = 1;
            } else if (velocidad>=81) {
                multa = 2;
            }
        }

        switch (multa) {
            case 0:
                System.out.println("No hay multa.");
                break;
            case 1:
                System.out.println("Multa leve.");
                break;
            case 2:
                System.out.println("Multa grave.");
                break;
        }
    sc.close();
    }     
}
