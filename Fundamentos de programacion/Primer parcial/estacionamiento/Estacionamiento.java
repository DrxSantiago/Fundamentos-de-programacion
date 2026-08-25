import java.util.Scanner;

public class Estacionamiento {
    public static void main (String [] args){
        int costo=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número de horas que estuvo estacionado: ");
        int horas = sc.nextInt();

            if (horas>=2) {
                costo = horas * 30;
            } else if (horas>=3 && horas<=5) {
                costo = (60) + (horas-2)*25;
            } else if (horas>=6 && horas<=10) {
                costo = (60) + (75) + (horas-5)*20;
            } else if (horas>10) {
                costo = 380;
            }

            System.out.println("El costo del estacionamiento es de: $"+ costo);
            sc.close();
    }
}