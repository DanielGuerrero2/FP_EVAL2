import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        String accum = "";
        for (int i = 0; i < numero; i++) {
            accum += "*";
            System.out.println(accum);
        }
    }
}