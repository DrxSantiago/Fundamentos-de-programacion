package casos_con_ciclos;
import java.util.Scanner;

public class areas_figuras {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- CÁLCULO DE ÁREAS GEOMÉTRICAS ---");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Triángulo");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción (1-5): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- ÁREA DEL CUADRADO ---");
                    double lado = pedirDatoPositivo(scanner, "Ingresa la longitud del lado: ");
                    double areaCuadrado = lado * lado;
                    System.out.println("El área del cuadrado es: " + areaCuadrado);
                    break;

                case 2:
                    System.out.println("\n--- ÁREA DEL RECTÁNGULO ---");
                    double baseRect = pedirDatoPositivo(scanner, "Ingresa la base: ");
                    double alturaRect = pedirDatoPositivo(scanner, "Ingresa la altura: ");
                    double areaRectangulo = baseRect * alturaRect;
                    System.out.println("El área del rectángulo es: " + areaRectangulo);
                    break;

                case 3:
                    System.out.println("\n--- ÁREA DEL CÍRCULO ---");
                    double radio = pedirDatoPositivo(scanner, "Ingresa el radio del círculo: ");
                    double areaCirculo = Math.PI * Math.pow(radio, 2);
                    System.out.printf("El área del círculo es: %.2f\n", areaCirculo);
                    break;

                case 4:
                    System.out.println("\n--- ÁREA DEL TRIÁNGULO ---");
                    double baseTri = pedirDatoPositivo(scanner, "Ingresa la base: ");
                    double alturaTri = pedirDatoPositivo(scanner, "Ingresa la altura: ");
                    double areaTriangulo = (baseTri * alturaTri) / 2.0;
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }

    public static double pedirDatoPositivo(Scanner scanner, String mensaje) {
        double valor = 0;
        while (valor <= 0) {
            System.out.print(mensaje);
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.println("Error: El valor debe ser mayor que 0. Inténtalo otra vez.");
            }
        }
        return valor;
    }

}
