import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int[]  alumnos = new int[10];

        for (int i = 0; i<alumnos.length; i++){
            System.out.println("Digita  calificación");
            alumnos[i]= sc.nextInt();

        }
        sc.close();

        System.out.println(Arrays.toString(alumnos));
    }
}