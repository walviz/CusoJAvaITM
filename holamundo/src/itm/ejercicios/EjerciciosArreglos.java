import javax.swing.JOptionPane;

public class EjerciciosArreglos {

    private int[] promedio;

    public void Star(){

    }

    public double[] IngresarNumeros(double[] vec){
        for (int i = 0; i < vec.length; i++) {
            vec[i]= Double.parseDouble(JOptionPane.showInputDialog("ingresar numero"));       
        }

        return vec;
    }

    public String MonstrarVectores( double[] vec){

        String mesaje=" "+vec.length+ " ";
        
        for (int i = 0; i < vec.length; i++) {
            mesaje += vec[i]+ " ";
        }

        
        return mesaje;
        
    }

    public String SumarPromedio(double[] vec){
        String mesaje="";
        double suma=0;
        for (int i = 0; i < vec.length; i++) {
            suma += vec[i];
        }

        double promedio = suma/vec.length;

        return mesaje = "El promedio es "+ promedio+ " y la suma es " +suma;
        
    }


}
