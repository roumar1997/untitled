import javax.swing.*;

public class ejercicio1 {


    static void main(String[] args) {



        int numeroAleatorio = (int) (Math.random()*100);

        int intentos = 0;

        int numeroSeleccionado = 0;
        System.out.println(numeroAleatorio);

         do {

            String introducido = JOptionPane.showInputDialog("dime el número que eliges");
            numeroSeleccionado = Integer.parseInt(introducido);
            intentos++;


            int respuesta = 0;
            if (intentos == 3) {
                JOptionPane.showMessageDialog(null, "llevas 3 intentos bro");
            } else if (intentos == 4) {
                JOptionPane.showMessageDialog(null, "llevas 4 intentos bro");
            } else if (intentos == 5) {
                respuesta = JOptionPane.showConfirmDialog(null, "quieres seguir jugando",
                        "confirmacion",
                        JOptionPane.YES_NO_OPTION
                );

                if (respuesta == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "El número era: " + numeroAleatorio);
                    break; // 🔥 salimos del while
                }

            }


            if (numeroAleatorio > numeroSeleccionado) {
                JOptionPane.showMessageDialog(null, "mas alto");
            } else if (numeroAleatorio < numeroSeleccionado) {
                JOptionPane.showMessageDialog(null, "mas abajo");

            } else if (numeroAleatorio == numeroSeleccionado) {
                JOptionPane.showMessageDialog(null, "correctoooo y lo hciiste en: " + intentos + " intentos");
            }


        }while (numeroAleatorio != numeroSeleccionado);





    }


}
