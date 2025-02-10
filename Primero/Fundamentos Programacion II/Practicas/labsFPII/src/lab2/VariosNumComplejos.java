package lab2;
import java.util.Random;

public class VariosNumComplejos {

    NumeroComplejo[] numerosComplejos;

    public VariosNumComplejos(int n) {
        if(n<0)
        {
            return;
        }
        numerosComplejos = new NumeroComplejo[n];
        Random rand = new Random();
        for (int i=0; i<n; i++ ) {
            double real = rand.nextInt(10);
            double imag = rand.nextInt(10);
            numerosComplejos[i] = new NumeroComplejo(real,imag);
        }
    }

    public NumeroComplejo sumaTodos(){
        double accReal = 0;
        double accImag = 0;
        for (NumeroComplejo numeroComplejo : numerosComplejos) {
            accReal += numeroComplejo.getParteReal();
            accImag += numeroComplejo.getParteImag();
        }

        return new NumeroComplejo(accReal,accImag);

    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("Numeros Complejos del array: {\n");
        for(NumeroComplejo numeroComplejo : numerosComplejos) {
           sb.append(numeroComplejo.toString()+" | ");
        }
        sb.append("\n}\n");
        return sb.toString();

    }

}
