import javax.swing.JOptionPane;


//String.format("%.2f", number)

public class Notas {
    private double n1, n2, n3,promedio;


    public void calcularPromedio(){
        setN1(Double.parseDouble(JOptionPane.showInputDialog("*** Digite primera nota ***")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("*** Digite segunda nota ***")));
        setN3(Double.parseDouble(JOptionPane.showInputDialog("*** Digite tercera nota ***")));
        setPromedio((getN1()+getN2()+getN3())/3);
        if (getPromedio() >= 3){
            JOptionPane.showMessageDialog(null,"el Promedio es de  "+String.format("%.2f", getPromedio())+" Gano !!");
        }else {
            JOptionPane.showMessageDialog(null,"el Promedio es de  "+String.format("%.2f", getPromedio())+" Pediste vuelve a intentar !!");
        }
    }



    //get set

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double getN3() {
        return n3;
    }

    public double getPromedio() {
        return promedio;
    }





}
