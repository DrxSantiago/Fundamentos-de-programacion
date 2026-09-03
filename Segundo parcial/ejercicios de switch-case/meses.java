package casos_switch;
import java.util.Scanner;

public class meses {
	static public void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero del 1 al 12:");
		int meses = sc.nextInt();
		
		switch (meses) {
		case 1 :
			System.out.println("Este dia corresponde al mes de Enero y tiene 31 dias");
			break;
		case 2 :
			System.out.println("Este dia corresponde al mes de Febrero y tiene 28 dias");
			break;
		case 3 :
			System.out.println("Este dia corresponde al mes de Marzo y tiene 31 dias");
			break;
		case 4 :
			System.out.println("Este dia corresponde al mes de Abril y tiene 30 dias");
			break;
		case 5 :
			System.out.println("Este dia corresponde al mes de Mayo y tiene 31 dias");
			break;
		case 6 :
			System.out.println("Este dia corresponde al mes de Junio y tiene 30 dias");
			break;
		case 7 :
			System.out.println("Este dia corresponde al mes de Julio y tiene 31 dias");
			break;
		case 8 :
			System.out.println("Este dia corresponde al mes de Agosto y tiene 31 dias");
			break;
		case 9 :
			System.out.println("Este dia corresponde al mes de Septiembre y tiene 30 dias");
			break;
		case 10 :
			System.out.println("Este dia corresponde al mes de Octubre y tiene 31 dias");
			break;
		case 11 :
			System.out.println("Este dia corresponde al mes de Noviembre y tiene 30 dias");
			break;
		case 12 :
			System.out.println("Este dia corresponde al mes de Diciembre y tiene 31 dias");
			break;
		default: System.out.println("Ingrese un dato valido");
		}
		sc.close();
	}
	

}
