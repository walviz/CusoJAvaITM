package itm.ejercicios;

import javax.swing.JOptionPane;

public class EjercicioRuta {
    public static void main(String[] args) throws Exception {
         
        int lunes= Integer.parseInt(JOptionPane.showInputDialog("tiempo lunes "));
        int miercoles = Integer.parseInt(JOptionPane.showInputDialog("tiempo miercoles "));
        int viernes = Integer.parseInt(JOptionPane.showInputDialog("tiempo Viernes "));
        double promedio =(lunes + miercoles + viernes)/3;
        JOptionPane.showMessageDialog(null, "El promedio es "+ promedio );
        
    }
}
