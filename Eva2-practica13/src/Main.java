import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu cadena: ");
        String cadena = scanner.nextLine();
        int count =0;
        for(int i =0; i<cadena.length(); i++){
            if(cadena.toLowerCase().charAt(i) == 'a' || cadena.toLowerCase().charAt(i) == 'e' || cadena.toLowerCase().charAt(i) == 'i' || cadena.toLowerCase().charAt(i) == 'o' || cadena.toLowerCase().charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("La cantidad de vocales en la cadena es: " + count);
    }
}