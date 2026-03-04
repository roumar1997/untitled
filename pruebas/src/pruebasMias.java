import javax.swing.*;

public class pruebasMias {

    public static void main(String[] args) {


        String email = JOptionPane.showInputDialog("introduce tu email");

        int arroba = 0;
        int punto = 0;


        for (int i =0; i<email.length(); i++){

            if (email.charAt(i)=='@') arroba++;
            if (email.charAt(i)=='.') punto++;
        }
        if (arroba==1 && punto==1) System.out.println("correcto, pase");
        else System.out.println("correo erroneo");
    }



}
