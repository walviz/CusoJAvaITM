
import javax.swing.JOptionPane;

public class Pulsasiones {
    public static void main(String[] args) throws Exception {

        int edad= Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
        double promedio =(220-edad)/10;
        JOptionPane.showMessageDialog(null, "El numero de pulsasiones es  "+ promedio );
        
    }
}
