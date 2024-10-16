import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        int diamax = 0;

        while (true) {
            System.out.println("ingresa en que día de la semana estás");
            dia = sc.nextInt();

            if(diamax < dia){
                diamax = dia;
            }

            if (dia >= 1 && dia <= 7) {
                break;
            }

        }
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

        System.out.println("El numero más alto que ingreso el usuario fue: "+diamax);

    }


}