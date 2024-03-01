package itm.ejercicios;
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Libro {
    private String id, nombre, autor;
    private int paginas;
    private double precio;
    private boolean disponible;

    public void IngresarLibro () {
        setId(JOptionPane.showInputDialog("ingresar id "));
        setNombre(JOptionPane.showInputDialog("ingresar Nombre "));
        setAutor(JOptionPane.showInputDialog("ingresar autor "));
        setPaginas(Integer.parseInt(JOptionPane.showInputDialog("ingresar numero de paginas ")) );
        setPrecio(Double.parseDouble(JOptionPane.showInputDialog("ingresar valor ")));
        setDisponible(Boolean.parseBoolean(JOptionPane.showInputDialog("Disponible?")));
        JOptionPane.showMessageDialog(null,  MostrarLibro());

    }

    public String MostrarLibro (){

        String texto="**** los datos ingresados son \n"+
                     "Id: "+getId()+"\n"+
                     "Nombre: "+getNombre()+"\n"+
                     "Autor: "+getAutor()+"\n"+
                     "Numero de paginas: "+getPaginas()+"\n"+
                     "Valor : "+ getPrecio()+"\n"+
                     "Disponible: "+isDisponible()+"\n"
                     ;


        return texto;
    }

    public  Libro(){

    }

    // get

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }


    ///set
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
