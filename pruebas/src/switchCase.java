import java.util.Scanner;

public class switchCase {

    static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);
        System.out.println("introduce el nombre del mes por favor: ");
        String mes = entrada.nextLine();


        String resultadoSwitch = switch (mes) {

            case "enero" -> "1";

            case "febrero" -> "2";
            case "marzo" -> "3";
            case "abril" -> "4";
            case "mayo" -> "5";
            case "junio" -> "6";
            default -> "no esta entre el 1 y el 6";


        };
        System.out.println(resultadoSwitch);





    }
}


