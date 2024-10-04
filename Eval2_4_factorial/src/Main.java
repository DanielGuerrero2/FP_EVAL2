import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el numero");

        int acum=1;
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {


            acum = acum * i;



            }
        System.out.println("El factorial de " + num + " es: " + acum);
    }
}