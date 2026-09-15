package casos_con_ciclos;
import java.util.Scanner;

public class saludo_hora {
	static public void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int hora = -1;

        while (hora < 0 || hora > 23) {
            System.out.print("Ingresa la hora (formato 0 a 23): ");
            hora = sc.nextInt();

            if (hora < 0 || hora > 23) {
                System.out.println("Hora no válida. Inténtalo de nuevo.");
            }
        }

        switch (hora) {
            case 6: case 7: case 8: case 9: case 10: case 11: case 12:
                System.out.println("Buenos días");
                break;
            case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
                System.out.println("Buenas tardes");
                break;
            case 21: case 22: case 23:
            case 0: case 1: case 2: case 3: case 4: case 5:
                System.out.println("Buenas noches");
                break;
        }

        sc.close();
	}

}
