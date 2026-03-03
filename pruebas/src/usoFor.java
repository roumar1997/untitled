import javax.swing.*;
import java.sql.SQLOutput;

public class usoFor {


        public static void main(String[] args) {


            String mail = JOptionPane.showInputDialog("introduce tu correo");

            int arroba =0;
            int punto = 0;
            for (int i=0; i<mail.length();i++){
                if (mail.charAt(i)=='@') arroba++;
                if (mail.charAt(i)=='.') punto++;
            }
            if (arroba==1 && punto==1) System.out.println("acceso permitido");
            else System.out.println("mail incorrecto");
        }
}
