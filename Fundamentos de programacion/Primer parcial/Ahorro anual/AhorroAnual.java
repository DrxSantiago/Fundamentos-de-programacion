import java.util.Scanner;

public class AhorroAnual {
    public static void main(String[] args) {
        int mes;
        double ahorro = 0;
        Scanner sc = new Scanner(System.in);

        for (mes = 1; mes <= 12; mes++) {
            System.out.print("Introduce el ahorro del mes " + mes + ": ");
            double ahorroMes = sc.nextDouble();
            ahorro += ahorroMes;
        }
        System.out.println("El ahorro total después de 12 meses es: " + ahorro);
    sc.close();
    }
    
}
