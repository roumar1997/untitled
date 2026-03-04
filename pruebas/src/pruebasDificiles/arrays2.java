package pruebasDificiles;

import javax.swing.*;

public class arrays2 {
    public static void main(String[] args) {



       String[] paises = new String[9];

       for (int i=0; i< paises.length; i++) {
           paises[i] = JOptionPane.showInputDialog("introduce 1 pais");

       }


        //  for (int i=0;i<paises.length;i++){
       //    System.out.println(paises[i]);
       //}
        for(String countries: paises) System.out.println(countries);
    }



}

