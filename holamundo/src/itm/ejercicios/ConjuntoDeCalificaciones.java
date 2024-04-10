import javax.swing.JOptionPane;


public class ConjuntoDeCalificaciones {
    private double acuNotas , notaBaja=99, num;

    public void Star(){
        for (int i = 0; i < 10; i++) {
            num = (Double.parseDouble(JOptionPane.showInputDialog("Digite Nota del estudiante "+ (i+1))));
            acuNotas = acuNotas+ num;
            if (num < notaBaja) {
                notaBaja = num;
            }           
        }
        JOptionPane.showMessageDialog(null, "El promedio de las notas es  " + String.format("%.2f",(acuNotas/10))+"\n"+ "La nota mas baja es  " + String.format("%.2f", notaBaja));
    }



}

//String.format("%.2f",(acuNotas/10))
