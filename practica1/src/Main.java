import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String input=scanner.nextLine();
        for(int i=0;i<input.length();i++){
            System.out.println(input);
        }
    }
}