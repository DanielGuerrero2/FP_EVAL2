import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalCalificaciones = 5;
        Scanner sc = new Scanner(System.in);


        double count = 0;


        for (int i = 0; i < totalCalificaciones; i++) {
            System.out.println("Ingrese la calificacion " + (i + 1) + ": ");

            int calificacion = sc.nextInt();
            count += calificacion;


        }

        double promedio = count / totalCalificaciones;

        System.out.println("El promedio es: " + promedio);

    }
}