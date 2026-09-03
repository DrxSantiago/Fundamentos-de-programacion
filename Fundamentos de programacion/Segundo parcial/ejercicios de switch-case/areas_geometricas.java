package casos_switch;
import java.util.Scanner;

public class areas_geometricas {
	static public void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double area=0;
		
		System.out.println("Seleccione la figura la cual queire concer su area");
		System.out.println("(1) Cuadrado");
		System.out.println("(2) Rectangulo");
		System.out.println("(3) Triangulo");
		System.out.println("(4) Circulo");
		int figura = sc.nextInt();
		
		switch (figura) {
		case 1: 
			System.out.println("Selecciono el cuadrado");
			System.out.println("Ingrese la longitud de el lado:");
			double lado = sc.nextDouble();
			area=lado*lado;
			System.out.println("El area del cuadrado es: " + area);
			break;
		case 2: 
			System.out.println("Selecciono el Rectangulo");
			System.out.println("Ingrese la altura del rectangulo:");
			double altura = sc.nextDouble();
			System.out.println("Ingrese la base del rectangulo:");
			double base = sc.nextDouble();
			area=altura*base;
			System.out.println("El area del rectangulo es: "+ area);
			break;
		case 3: 
			System.out.println("Selecciono el Trianulo");
			System.out.println("Ingrese la altura del triangulo:");
			double altura1 = sc.nextDouble();
			System.out.println("Ingrese la base del triangulo:");
			double base1 = sc.nextDouble();
			area=(altura1*base1)/2;
			System.out.println("El area del triangulo es: "+ area);
			break;
		case 4: 
			System.out.println("Selecciono el Circulo");
			System.out.println("Ingrese la longitud del radio:");
			double radio = sc.nextDouble();
			area = (3.14)*(radio*radio);
			System.out.println("El area del circulo es: "+ area);
			break;
		}
		sc.close();
	}
}
