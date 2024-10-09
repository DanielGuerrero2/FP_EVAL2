import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int n1 = scanner.nextInt();

        System.out.println("Ingrese otro número entero: ");
        int n2 = scanner.nextInt();

        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.println(i);
            }
            for (int i = n2; i >= n1; i--) {
                System.out.println(i);
            }
        }
    }6
}
