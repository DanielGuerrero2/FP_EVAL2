import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        //usuario y contraseña
        String cont="", usua="";


        while(!(usua.equals("admi")&& cont.equals("3312"))){
            System.out.println("usuario:");
            usua=captu.nextLine();
            System.out.println("contraseña:");
            cont=captu.nextLine();

        }

        System.out.println("hola, esto es el programa principal");



    }
    }
