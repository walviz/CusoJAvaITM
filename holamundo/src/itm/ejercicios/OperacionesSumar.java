import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Operaciones {

    private int _n;

    public int get_n() {
        return _n;
    }

    public void set_n(int _n) {
        this._n = _n;
    }

    public Operaciones() {
        super();
    }


    // operaciones 
    public int sumaFor (){
        int resultado=0;

        for (int i = 1; i <= get_n(); i++) {
            resultado += i;
        }
        return resultado;
    }



    public int sumaWhile (){

        int resultado = 0;
        int i = 1;

        while (i <= get_n()) {
            resultado += i;
            i++;
        }

        return resultado;
    }


    public int sumaDoWhile (){
        int resultado = 0;
        int i = 1;

        do {
            resultado += i;
            i++;
        } while (i <= get_n());
        return resultado;

    }




    public void Mostrar(){
        JOptionPane.showMessageDialog(null, "(For) la suma de "+ get_n() + " es " +sumaFor());
        JOptionPane.showMessageDialog(null, "(While) la suma de "+ get_n() + " es " +sumaWhile());
        JOptionPane.showMessageDialog(null, "(DoWhile) la suma de "+ get_n() + " es " +sumaDoWhile());
    }

    public void Star (){
        set_n(Integer.parseInt(JOptionPane.showInputDialog("**** Ingrese hasta donde desea sumar ***")));
        Mostrar();

    }

}
