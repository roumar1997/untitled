import java.util.Scanner;

public class UsoMath {
    static void main() {



        Scanner entrada= new Scanner(System.in);

        System.out.println("introduce tu edad: ");

        int edad= entrada.nextInt();


            if (edad <= 18 ){
                System.out.println("eres muy joven");
        } else if (edad <= 35) {
                System.out.println("eres mediano");
            } else if (edad <=60) {
                System.out.println("eres muy maduro");
            } else if (edad<=90) {
                System.out.println("eres muy mayor");
            } else if (edad <=110) {
                System.out.println("estas casi muerto");
            } else if (edad<=120) {
                System.out.println("eres mentiroso deberias estar muerto");
            } else {
                System.out.println("estas muerto");
            }


    }
}
