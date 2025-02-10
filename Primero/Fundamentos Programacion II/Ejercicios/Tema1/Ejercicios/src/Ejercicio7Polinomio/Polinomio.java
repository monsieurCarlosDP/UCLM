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

    public Polinomio(Monomio[] polinomio) {
        this.polinomio = polinomio;
        tamanio = polinomio.length;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(Monomio m : polinomio)
        {
            if(m != null) {
                String signo = "";
                if (m.getCoeficiente() > 0)
                    signo = "+";
                else
                    signo = "-";

                s.append(signo + m.toString());
            }
        }
        return s.toString();
    }

    public Polinomio anadirMonomio(Monomio monomio)
    {
        int posicion = monomio.getExponente();
        Monomio[] aux = new Monomio[posicion+1];
        if(posicion < 0)
            return this;

        if(posicion >= tamanio) {
            System.arraycopy(polinomio, 0, aux, 0, tamanio);
            aux[posicion] = monomio;
            polinomio = aux;
            return this;
        }

        if(polinomio[posicion] != null) {
            polinomio[posicion].setCoeficiente(polinomio[posicion].getCoeficiente() + monomio.getCoeficiente());
            return this;
        }

        return this;



    }


}
