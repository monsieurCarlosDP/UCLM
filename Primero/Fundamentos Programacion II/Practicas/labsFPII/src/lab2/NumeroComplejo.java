package lab2;

public class NumeroComplejo {
    private double real;
    private double imag;

    public NumeroComplejo() {
        this.real = 0;
        this.imag = 0;
    }

    public NumeroComplejo(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public NumeroComplejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public NumeroComplejo(NumeroComplejo nc) {
        this.real = nc.getParteReal();
        this.imag = nc.getParteImag();
    }

    public double getParteReal(){
        return this.real;
    }
    public double getParteImag(){
        return this.imag;
    }

    public void setParteReal(double real){
        this.real = real;
    }

    public void setParteImag(double imag){
        this.imag = imag;
    }

    public NumeroComplejo sumar(NumeroComplejo nc) {
        double realRes = this.real + nc.getParteReal();
        double imagRes = this.imag + nc.getParteImag();
        return new NumeroComplejo(realRes, imagRes);
    }

    public NumeroComplejo restar(NumeroComplejo nc) {
        double realRes = this.real - nc.getParteReal();
        double imagRes = this.imag - nc.getParteImag();
        return new NumeroComplejo(realRes, imagRes);
    }

    public NumeroComplejo multiplicar(NumeroComplejo nc) {
        double realRes = this.real * nc.getParteReal() - this.imag * nc.getParteImag();
        double imagRes = this.imag * nc.getParteReal() + this.real * nc.getParteImag();
        return new NumeroComplejo(realRes, imagRes);
    }

    public NumeroComplejo multiplicarEscalar(double escalar){
        double realRes = this.real * escalar;
        double imagRes = this.imag * escalar;
        return new NumeroComplejo(realRes, imagRes);
    }

    public boolean comparar(NumeroComplejo nc) {
        return this.real == nc.getParteReal() && this.imag == nc.getParteImag();
    }

    @Override
    public String toString() {
        return real+" + "+imag+"i";
    }
}
