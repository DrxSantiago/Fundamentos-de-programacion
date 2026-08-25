import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        if (numero == 0) {
            System.out.println("El número es Neutro (0)");
        } else if (numero % 2 == 0) {
            System.out.println("El número es Par");
        } else {
            System.out.println("El número es Impar");
        }
        sc.close();
    }
}
