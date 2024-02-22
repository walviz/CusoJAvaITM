package itm.ejercicios;

public class IntercambiarValorDeVariables {

    public void intercambiar(){
        String letraA="a",letraB="b",aux;
        aux = letraA;
        letraA = letraB;
        letraB = aux;
        System.out.println(letraA);
        System.out.println(letraB);

    }

}
