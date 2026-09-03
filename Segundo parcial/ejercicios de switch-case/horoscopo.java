package casos_switch;
import java.util.Scanner;

public class horoscopo {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu mes de nacimiento (1 a 12): ");
        int mes = sc.nextInt();

        System.out.print("Ingresa tu día de nacimiento (1 a 31): ");
        int dia = sc.nextInt();

        String signo = "";

        switch (mes) {
            case 1:
                signo = (dia <= 19) ? "Capricornio" : "Acuario";
                break;
            case 2:
                signo = (dia <= 18) ? "Acuario" : "Piscis";
                break;
            case 3:
                signo = (dia <= 20) ? "Piscis" : "Aries";
                break;
            case 4:
                signo = (dia <= 19) ? "Aries" : "Tauro";
                break;
            case 5:
                signo = (dia <= 20) ? "Tauro" : "Géminis";
                break;
            case 6:
                signo = (dia <= 20) ? "Géminis" : "Cáncer";
                break;
            case 7:
                signo = (dia <= 22) ? "Cáncer" : "Leo";
                break;
            case 8:
                signo = (dia <= 22) ? "Leo" : "Virgo";
                break;
            case 9:
                signo = (dia <= 22) ? "Virgo" : "Libra";
                break;
            case 10:
                signo = (dia <= 22) ? "Libra" : "Escorpio";
                break;
            case 11:
                signo = (dia <= 21) ? "Escorpio" : "Sagitario";
                break;
            case 12:
                signo = (dia <= 21) ? "Sagitario" : "Capricornio";
                break;
            default:
                signo = "Mes no válido";
                break;
        }

        if (!signo.equals("Mes no válido")) {
            System.out.println("Tu signo del horóscopo es: " + signo);
        } else {
            System.out.println("Error: Ingresa un mes válido entre 1 y 12.");
        }

        sc.close();
	}

}
