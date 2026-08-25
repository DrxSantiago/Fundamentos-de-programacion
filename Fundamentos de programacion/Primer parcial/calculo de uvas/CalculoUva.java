import java.util.Scanner;

public class CalculoUva {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio inicial por kilo: ");
        double precioInicial = sc.nextDouble();

        System.out.println("Ingrese la cantidad de kilos entregad2os: ");
        double kilos = sc.nextDouble();

        System.out.println("Ingrese el tipo de uva (A) (B): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        System.out.println("Ingrese el tamaño de la uva (1) o (2): ");
        int tamaño = sc.nextInt();

        double precioFinal = precioInicial;

        if (tipo == 'A') {
            if (tamaño == 1) {
                precioFinal += 0.20;
            } else if (tamaño == 2) {
                precioFinal += 0.30;
            }
        } else if (tipo == 'B') {
            if (tamaño == 1) {
                precioFinal -= 0.30;
            } else if (tamaño == 2) {
                precioFinal -= 0.50;
            }
        }
        double gananciaTotal = precioFinal * kilos;

        System.out.println("El precio final por kilo es: " + precioFinal);
        System.out.println("La ganancia total es: " + gananciaTotal);

        sc.close();
    }
    
}
