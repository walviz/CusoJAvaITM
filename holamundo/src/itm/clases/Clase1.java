package itm.clases;
import java.util.Scanner; // nesesario para poder ingresar datos por teclado

public class Clase1 {


    public void metodoClase1(){     
        Scanner teclado=new Scanner(System.in); // se crea instancia  
        int num0 , num1,resul;
        System.out.print("Primer numero: ");
        num0 = teclado.nextInt();  
        System.out.print("Segundo numero: ");
        num1 = teclado.nextInt(); 
        resul = num0+num1; 
        System.out.println("la suma de "+num0+" y "+num1+" es "+ resul);
        teclado.close();
    }

}
