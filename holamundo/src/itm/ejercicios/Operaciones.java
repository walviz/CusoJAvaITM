package itm.ejercicios;

import javax.swing.JOptionPane;

public class Operaciones {
    private double num1, num2;

    public Operaciones() {
        super();
    }
    public String sumar (){
        
        double resul = getNum1() + getNum2();
        String sueldoFormateado = String.format("%.0f", resul);
        return sueldoFormateado;

    }

    public void IngresarNumeroSuma(){
        setNum1(Double.parseDouble(JOptionPane.showInputDialog("Numero 1: ")));
        setNum2(Double.parseDouble(JOptionPane.showInputDialog("Numero 2: ")));
    }



    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }



}
