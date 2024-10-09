import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce tu texto");
        String texto = scanner.nextLine();
        String VocalesT="";
        for(int i = 0; i < texto.length(); i++) {

        if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u' || texto.charAt(i) == 'A' || texto.charAt(i) == 'E' || texto.charAt(i) == 'I' || texto.charAt(i) == 'O' || texto.charAt(i) == 'U') {
            char letra = texto.charAt(i);
            VocalesT += letra+" ";
        }

        }
        System.out.println(VocalesT);


    }
}