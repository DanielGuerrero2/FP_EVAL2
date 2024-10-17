import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero decimal: ");
        int numero = scanner.nextInt();
        String binario = "";
        while(numero > 0){
            binario = numero % 2 + binario;
            numero = numero / 2;
        }
        System.out.println("El numero en binario es: " + binario);


    }
}