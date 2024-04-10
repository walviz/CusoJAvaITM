import javax.swing.JOptionPane;

public class Contador {


    private String resul="";
    private int num =0,contPos=0,contNeg=0, contNeutro=0;

    public void Star(){
        for (int i = 0; i < 10; i++) {
            num = (Integer.parseInt(JOptionPane.showInputDialog("Digite numero "+ (i+1))));
            if (num==0) {
                contNeutro++;
            }else{
                if (num >0) {
                    contPos++;
                }else{
                    contNeg++;
                }
            }
            
        }

        JOptionPane.showMessageDialog(null, "Cantidad neutro " + contNeutro+"\n"+ "Cantidad positivos " + contPos+"\n"+ "Cantidad negativos " + contNeg);
        
    }







    // GET SETTERS

    public String getResul() {
        return resul;
    }

    public void setResul(String resul) {
        this.resul = resul;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getContPos() {
        return contPos;
    }

    public void setContPos(int contPos) {
        this.contPos = contPos;
    }

    public int getContNeg() {
        return contNeg;
    }

    public void setContNeg(int contNeg) {
        this.contNeg = contNeg;
    }

    public int getContNeutro() {
        return contNeutro;
    }

    public void setContNeutro(int contNeutro) {
        this.contNeutro = contNeutro;
    }

    



}
