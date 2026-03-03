
import java.util.HashMap;
import java.util.Map;

public class ejercicioAndres {


    static void main(String[] args) {

        //partidos Pa vs pb -> seta-setb

        HashMap<String, String> partidos = new HashMap<>();
        partidos.put("alvaro/andres vs ernesto/raul", "2-1");
        partidos.put("pedro/javi vs ernesto/raul", "5-3");
        partidos.put("alvaro/andres vs pedro/javi", "3-5");
        partidos.put("alvaro/andres vs ana/lucia", "1-2");

        //mostrar partoidps
        System.out.println("partidos y resultados");
        for (Map.Entry<String, String>entry: partidos.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
        //cont victorias
        HashMap<String, Integer> vitorias = new HashMap<>();

        for (Map.Entry<String,String> entry: partidos.entrySet()){
            String partido = entry.getKey();
            String resultado = entry.getValue();


            String[] equipos = partido.split("vs");
            String equipoA = equipos[0].trim();
            String equipoB = equipos[1].trim();



            String[] sets = resultado.split("-");
            int setsA = Integer.parseInt(sets[0].trim());
            int setsB = Integer.parseInt(sets[1].trim());



            if (setsA > setsB){
                vitorias.put(equipoA, vitorias.getOrDefault(equipoA,0)+ 1);
            } else if (setsB >setsA) {
                vitorias.put(equipoB, vitorias.getOrDefault(equipoB, 0)+1);

            }
        }


        System.out.println("Victoriaaaaaaaaas");
        for (Map.Entry<String,Integer> entry: vitorias.entrySet()){
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }
    }
}