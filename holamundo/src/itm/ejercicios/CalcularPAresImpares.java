import javax.swing.JOptionPane;

public class CalcularPAresImpares {

    public CalcularPAresImpares() {
        super();
    }


    public void star(){
        int sumaPares = 0;
        int sumaImpares = 0;


        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                sumaImpares += i;
            }
        }
        JOptionPane.showMessageDialog(null, "Suma de números pares: " + sumaPares);
        JOptionPane.showMessageDialog(null, "Suma de números impares: " + sumaImpares);
    }




}
