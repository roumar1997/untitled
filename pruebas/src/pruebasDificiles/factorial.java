package pruebasDificiles;

import javax.swing.*;

public class factorial {

    public static void main(String[] args) {


        String number = JOptionPane.showInputDialog("introduce un numero");
        int number1 = Integer.parseInt(number);
        int resultado =1;
        for (int i=number1;i>0;i--) resultado= resultado*i;

        System.out.println("el resultado es: "+ resultado );

        }


    }




