
import javax.swing.*;

public class Estudiante {
    // atributos
    private double n1, n2, n3;
    // metodo constructor

    public Estudiante() {
    }
    //metodos get y set

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public void ingresar_notas (int contador){
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota del estudiante "+contador)));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota del estudiante "+contador)));
        setN3(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota del estudiante "+contador)));
    }

    public void validar_notas (int contador){

        if ((getN1() < 0 || getN1()>5) || (getN2() < 0 || getN2() > 5) || (getN3() < 0 || getN3()>5)) {
            JOptionPane.showMessageDialog(null, "las notas deben ser entre 0 y 5");
            ingresar_notas(contador);
            validar_notas(contador);
        }


    }

    public String validar_promedio (int contador){
        String resultado;
        double promedio;
        promedio = (getN1() + getN2() + getN3())/3;
            if (promedio >= 3){
                resultado = "el estudiante "+contador+" aprueba la asignatura con un promedio de "+promedio;
            }else{
                resultado = "el estudiante "+contador+" reprueba la asignatura con un promedio de "+promedio;
            }
            return resultado;
    }
}
