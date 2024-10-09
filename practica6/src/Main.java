import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        String accum = "";
        char c = '*';
       for (int i= numero; i>0; i--){
           //en la primera iteración i=5 y j es

           for (int j=0; j<i; j++){
               accum += c;
           }
           System.out.println(accum);
           accum = "";

       }
    }
}