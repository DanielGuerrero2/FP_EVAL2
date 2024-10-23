import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qué tamaño tendrá el menú: ");
        int tam = sc.nextInt();
        sc.nextLine();
        String[] menuUser = new String[tam];
        int[] precio = new int[tam];

        for (int i = 0; i < tam; i++) {
            System.out.print("Ingresa el platillo: ");
            menuUser[i] = sc.nextLine();
            System.out.print("Ingresa el precio: ");
            precio[i] = sc.nextInt();
            sc.nextLine();
        }

        // Opcional: Mostrar el menú ingresado
        System.out.println("Menú ingresado:");
        for (int i = 0; i < tam; i++) {
            System.out.println(menuUser[i] + " - " + precio[i]);
        }
    }
}