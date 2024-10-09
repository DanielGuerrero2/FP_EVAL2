import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String input = scanner.nextLine();
        String accum="";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
          accum+=c+" ";
        }
        System.out.println(accum);


    }

}