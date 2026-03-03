import java.util.Scanner;

public class Switch {

    static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);
        System.out.println("introduce el nombre del mes por favor: ");
        String mes = entrada.nextLine();

        switch (mes){
            case "enero":
                System.out.println("mes vvale: "+ mes);
                System.out.println("1");
                break;
            case "febrero":
                System.out.println("mes vvale: "+ mes);
                System.out.println("2");
                break;
            case "marzo":
                System.out.println("mes vvale: "+ mes);
                System.out.println("3");
                //break;
            case "mayo":
                System.out.println("mes vvale: "+ mes);
                System.out.println("4");
                //break;
            case "junio":
                System.out.println("mes vvale: "+ mes);
                System.out.println("5");
               break;
            case "julio":
                System.out.println("mes vvale: "+ mes);
                System.out.println("6");
                break;
            default: System.out.println("no has nombre de enero a junio"); //es como el else en el if
                break;
        }



    }
}
