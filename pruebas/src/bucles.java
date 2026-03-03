import javax.swing.*;

public class bucles {


    public static void main(String[] args) {

//programa IMC

    String genero = "";
    do{

        genero = JOptionPane.showInputDialog("introduce tu genero(M / H");


    }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);

        int altura = Integer.parseInt( JOptionPane.showInputDialog("introduce tu altyura en cm"));


        if(genero.equalsIgnoreCase("H")){
            int resultadoh = altura -110;
            JOptionPane.showConfirmDialog(null,"tu IMC es: "+ resultadoh);

        } else if (genero.equalsIgnoreCase("M")) {
            int resultadom = altura-120;
            JOptionPane.showConfirmDialog(null,"tu IMC es: "+ resultadom);
        }


    }



}
