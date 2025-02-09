package Ejercicio7Polinomio;

public class Polinomio {

    Monomio[] polinomio;
    int tamanio;
    public Polinomio(int numero) {

        polinomio = new Monomio[numero];
        tamanio = numero;

    }

    public Polinomio(double[] coeficientes){

        tamanio = coeficientes.length;
        polinomio = new Monomio[tamanio];
        for(int i = 0; i < tamanio; i++) polinomio[i] = new Monomio(coeficientes[0], i);


    }
}
