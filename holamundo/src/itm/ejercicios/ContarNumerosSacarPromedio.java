import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        int numero;
        int suma = 0;
        int contador = 0;
        

        System.out.println("Introduce números (introduce 0 para finalizar):");

        do {
            numero = scanner.nextInt();
            suma += numero;
            contador++;
        } while (numero != 0);

        double promedio = (double) suma / (contador - 1); // Restamos 1 para excluir el cero

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

    }
}
