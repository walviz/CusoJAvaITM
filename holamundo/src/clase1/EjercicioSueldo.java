package clase1;
import java.util.Scanner; // nesesario para poder ingresar datos por teclado

public class EjercicioSueldo {

    public void sueldo(){
        Scanner teclado=new Scanner(System.in); // se crea instancia
        int horasTrabajadas;
        float costoHora;
        float sueldo;
        System.out.print("Horas Trabajadas: ");
        horasTrabajadas = teclado.nextInt();
        System.out.print("Valor Hora: ");
        costoHora = teclado.nextInt();
        sueldo = horasTrabajadas * costoHora;
        System.out.println("El sueldo es " + sueldo);
        //System.out.printf("El sueldo es %.0f%n", sueldo); // Muestra el sueldo sin decimales
        teclado.close();

    }
    
}
