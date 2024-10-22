import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] menu= {"pizza", "tacos", "hamburguesa", "hotdog", "torta"};
        int [] precio={100,120,80,70,80};

        System.out.println("Este es nuestro menu: " );
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + " $" + precio[i]);
        }
        System.out.println("¿Que desea ordenar?");
        int orden = scanner.nextInt();
        System.out.println("Vas a tener que pagar: $" + precio[orden-1] + " por tu " + menu[orden-1]);




    }
}