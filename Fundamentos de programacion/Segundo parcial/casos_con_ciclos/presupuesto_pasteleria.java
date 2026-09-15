package casos_con_ciclos;
import java.util.Scanner;

public class presupuesto_pasteleria {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sabor = "";
        double precioBase = 0;

        while (precioBase == 0) {
            System.out.print("Elija el sabor de la tarta (manzana, fresa, chocolate): ");
            sabor = sc.nextLine().toLowerCase().trim();

            switch (sabor) {
                case "manzana":
                    precioBase = 200.0;
                    break;
                case "fresa":
                    precioBase = 250.0;
                    break;
                case "chocolate":
                    String tipo = "";
                    while (!tipo.equals("negro") && !tipo.equals("blanco")) {
                        System.out.print("¿Tipo de chocolate? (negro o blanco): ");
                        tipo = sc.nextLine().toLowerCase().trim();
                        if (tipo.equals("negro")) precioBase = 280.0;
                        else if (tipo.equals("blanco")) precioBase = 300.0;
                    }
                    break;
                default:
                    System.out.println("Sabor no válido.");
                    break;
            }
        }

        System.out.print("¿Cuántos snacks desea agregar?: ");
        int cantidadSnacks = sc.nextInt();

        double costoSnacks = 0;
        for (int i = 1; i <= cantidadSnacks; i++) {
            costoSnacks += 25.0;
        }

        System.out.print("¿Desea personalizar con un nombre? (true/false): ");
        boolean conNombre = sc.nextBoolean();
        double costoNombre = conNombre ? 30.0 : 0.0;

        double total = precioBase + costoSnacks + costoNombre;

        System.out.println("\n----------------------------------------");
        System.out.println("Precio base de la tarta: $" + precioBase + " pesos");
        if (cantidadSnacks > 0) System.out.println("Snacks (" + cantidadSnacks + "): $" + costoSnacks + " pesos");
        if (conNombre) System.out.println("Nombre personalizado: $" + costoNombre + " pesos");
        System.out.println("Total del presupuesto: $" + total + " pesos");

        sc.close();
	}

}
