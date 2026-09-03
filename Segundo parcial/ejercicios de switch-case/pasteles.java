package casos_switch;
import java.util.Scanner;

public class pasteles {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- PRESUPUESTO DE TARTAS ---");
        System.out.print("Elija el sabor de la tarta (manzana, fresa, chocolate): ");
        String sabor = sc.nextLine().toLowerCase().trim();

        double precioBase = 0;
        boolean saborValido = true;

        switch (sabor) {
            case "manzana":
                precioBase = 200.0;
                break;

            case "fresa":
                precioBase = 250.0;
                break;

            case "chocolate":
                System.out.print("¿Qué tipo de chocolate prefiere? (negro o blanco): ");
                String tipoChocolate = sc.nextLine().toLowerCase().trim();

                if (tipoChocolate.equals("negro")) {
                    precioBase = 280.0;
                } else if (tipoChocolate.equals("blanco")) {
                    precioBase = 300.0;
                } else {
                    System.out.println("Error: Tipo de chocolate no válido.");
                    saborValido = false;
                }
                break;

            default:
                System.out.println("Error: Sabor no disponible.");
                saborValido = false;
                break;
        }

        if (saborValido) {
            System.out.print("¿Cuántos snacks desea agregar? (fresa, galleta, durazno, etc.): ");
            int cantidadSnacks = sc.nextInt();

            System.out.print("¿Desea personalizar la tarta con un nombre? (true/false): ");
            boolean conNombre = sc.nextBoolean();

            double costoSnacks = cantidadSnacks * 25.0;
            double costoNombre = conNombre ? 30.0 : 0.0;
            double total = precioBase + costoSnacks + costoNombre;

            System.out.println("\n----------------------------------------");
            System.out.println("Precio base de la tarta: $" + precioBase + " pesos");
            
            if (cantidadSnacks > 0) {
                System.out.println("Snacks (" + cantidadSnacks + "): $" + costoSnacks + " pesos");
            }
            
            if (conNombre) {
                System.out.println("Personalización con nombre: $" + costoNombre + " pesos");
            }
            
            System.out.println("----------------------------------------");
            System.out.println("Total del presupuesto: $" + total + " pesos");
        }

        sc.close();
    }

}
