package itm.ejercicios;

public class Persona {

    //atributos
    private String cedula , nombre, apellido;
    private int edad;
    private double sueldo;

    public Persona() {
    }


    public Persona(String cedula, String nombre, String apellido, int edad , double sueldo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String MostrarPersona(){
        String salida;
        String sueldoFormateado = String.format("%.0f", sueldo);
        
        salida ="****** Datos ******"+ "\n"+
                 "\n"+
                "Nombre : "+ nombre + "\n"+
                "Apellido : "+ apellido+"\n"+
                "Cedula : "+ cedula+ "\n"+
                "Edad : " + edad+ "\n"+
                "Sueldo : " + sueldoFormateado + "\n";
                
        
        return salida;
    }

}
