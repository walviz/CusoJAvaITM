import java.io.Console;

import javax.swing.JOptionPane;

public class ArreglosDefinicion {


    public void Star(){

        //formas de declarar arreglos
        int[] miArreglo;
        miArreglo = new int[5];

        //segunda forma
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // tercera forma
        int[] otrosNumeros = {10, 20, 30, 40, 50};
        JOptionPane.showMessageDialog(null,otrosNumeros[0]);

    }
}
