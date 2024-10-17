import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //pantalla de validacion
        Scanner captu = new Scanner(System.in);
        //usuario y contraseña
        String cont, usua;

        System.out.println("usuario:");
        usua=captu.nextLine();
        System.out.println("contraseña:");
        cont=captu.nextLine();
        do{


        }while(!(usua.equals("admi")&& cont.equals("3312")));
        System.out.println("hola, esto es el programa principal");



    }
    }
