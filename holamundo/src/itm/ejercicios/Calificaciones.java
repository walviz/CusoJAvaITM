import javax.swing.JOptionPane;

public class Calificaciones {
    private double n1, n2 , n3, nFinal, trabajo;

    public void ingresarNotas(){
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Nota 1: ")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Nota 2: ")));
        setN3(Double.parseDouble(JOptionPane.showInputDialog("Nota 3: ")));
        setnFinal(Double.parseDouble(JOptionPane.showInputDialog("Examen final: ")));
        setTrabajo(Double.parseDouble(JOptionPane.showInputDialog("Trabajo final: ")));
    }


    public  String resultado(){
        double promedio = (((getN1()+getN2()+getN3())/3)*0.55)+(getnFinal()*0.30)+(getTrabajo()*0.15);
        String sueldoFormateado = String.format("%.1f", promedio);
        return sueldoFormateado;
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

    public void setnFinal(double nFinal) {
        this.nFinal = nFinal;
    }

    public void setTrabajo(double trabajo) {
        this.trabajo = trabajo;
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

    public double getnFinal() {
        return nFinal;
    }

    public double getTrabajo() {
        return trabajo;
    }


}

