import javax.swing.JOptionPane;

public class Almacen {

    private double compra;

    public void IngresarCompra(int contador){
        setCompra(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la compra "+contador)));
    }

    public void ValidarCompra (int contador){


         if ((getCompra() > 100 )) {
            JOptionPane.showMessageDialog(null, "El valor de la compra es de "+String.format("%.2f",getCompra()*0.8)+" \nDescuento aplicado: "+String.format("%.2f",getCompra()*0.2)+" %");
        }else{
            if((getCompra() > 0) && (getCompra() <= 100)){
                JOptionPane.showMessageDialog(null, "El valor de la compra es de "+String.format("%.2f",getCompra())+"\nNo aplica descuento");
          }else{
                JOptionPane.showMessageDialog(null, "Quien va a comprar NEGATIVO eche!! vuelve a ingresar");
                IngresarCompra(contador);
                ValidarCompra(contador);
            }
            
        }


    }
//String.format("%.2f", getPromedio())









    //get set

    public void setCompra(double compra) {
        this.compra = compra;
    }

    public double getCompra() {
        return compra;
    }

}
