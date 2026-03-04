package pruebasDificiles;

import javax.swing.*;
import java.util.jar.JarEntry;

public class ejerciciosArrays {
    public static void main(String[] args) {



        int [] arraysAleatorios=  new int[200];
        int contador = 0;

        while (contador<arraysAleatorios.length){
            int aleatorio =(int) Math.round(Math.random()*50);
            boolean repetido = false;


            for (int i = 0; i<contador;i++){
                if (arraysAleatorios[i]==aleatorio){
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                arraysAleatorios[contador] = aleatorio;
                contador++;
            }
        }

        for (int i = 0; i<arraysAleatorios.length;i++){
            System.out.println(arraysAleatorios[i]);
        }





    }
}
