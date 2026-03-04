package pruebasDificiles;

import java.sql.SQLOutput;
import java.util.List;

public class arrays {

    public static void main(String[] args) {


        int [] miArray = new int[12];
        //List<String> nombres =List.of("ana","pedro","rodrigo","juan");
        int[] miArray2 = {3,20,22,34,25,23};

        for (int i=0;i<miArray.length;i++) {
            miArray[i] = i *2;


        }


        for (int i = 0; i<miArray.length;i++){
            System.out.println("i: "+ i+" valor es : "+miArray[i]);
        }
    }

}
