package Ejercicio7Polinomio;

public class Monomio {

    double coeficiente;
    int exponente;

    public Monomio(double coeficiente, int exponente){
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public int getExponente() {
        return exponente;
    }

    @Override
    public String toString(){
        String exp;
        if(this.exponente > 0)
            exp = "x^"+this.exponente;
        else
            exp = "";

        return this.coeficiente+exp;
    }

    public Monomio suma(Monomio m){
        if(this.exponente != m.exponente) {
            System.out.println("No se pueden sumar dos monomios con distinto exponente");
            return null;
        }

        return new Monomio(this.coeficiente + m.coeficiente, this.exponente);
    }

    public Monomio multiplicacion(Monomio m){

        return new Monomio(this.coeficiente * m.coeficiente, this.exponente+m.exponente);
    }

    public Monomio multiplicacion(double m){
        return new Monomio(this.coeficiente * m, this.exponente);
    }

    public double evaluar(double x){
        return this.coeficiente*Math.pow(x, this.exponente);
    }
}
