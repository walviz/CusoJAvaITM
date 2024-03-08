import javax.swing.JOptionPane;

public class Operaciones1 {

    private int num;

    public void CalcularNumero(){
        setNum(Integer.parseInt(JOptionPane.showInputDialog("Digite numero")));

        if (getNum() % 2 == 0){
            JOptionPane.showMessageDialog(null,"el numero "+getNum()+" es par");
        }else {
            JOptionPane.showMessageDialog(null,"el numero "+getNum()+"  es impar");
        }
    }

    

    public void setNum(int num) {
        this.num = num;
    }



    public int getNum() {
        return num;
    }

        
}
