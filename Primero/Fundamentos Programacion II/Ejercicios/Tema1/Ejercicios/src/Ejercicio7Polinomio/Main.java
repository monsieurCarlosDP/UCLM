package Ejercicio7Polinomio;

public class Main {

    public static void main(String[] args) {
        Polinomio polinomio = new Polinomio(new double[]{2, 1.4, 5.2, 9, 2});

        Monomio monomio = new Monomio(3,4);
        Monomio monomio2 = new Monomio(5,8);
        polinomio.anadirMonomio(monomio);
        System.out.println(polinomio.toString());
        polinomio.anadirMonomio(monomio2);
        System.out.println(polinomio.toString());




    }




}
