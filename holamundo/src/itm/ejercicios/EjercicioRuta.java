package itm.ejercicios;
import java.util.Scanner;

public class EjercicioRuta {
    Scanner teclado=new Scanner(System.in);
    int lunes;
    int miercoles, viernes;
    

    System.out.println("Tiempo lunes: ");
    lunes = teclado.nextInt();

    System.out.println("Tiempo Miercoles: ");
    miercoles = teclado.nextInt();

    System.out.println("Tiempo Viernes: ");
    viernes = teclado.nextInt();

    teclado.close();

}
