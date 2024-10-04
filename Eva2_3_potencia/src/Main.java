import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un número entero: ");

        int n = scanner.nextInt();
        System.out.println("Digita un exponente: ");
        int exponent = scanner.nextInt();
        int acum = 1;
        for(int i = 0; i < exponent; i++) {
            acum *= n;

        }
        System.out.println("El resultado de " + n + " elevado a la " + exponent + " es: " + acum);
    }
}