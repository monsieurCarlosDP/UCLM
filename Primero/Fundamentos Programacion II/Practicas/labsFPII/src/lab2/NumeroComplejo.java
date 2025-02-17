package lab2;

/*
* El objeto de esta clase es definir numeros complejos y operaciones con ellos
* @author Carlos Dïaz Pérez
* @version 202502101809
 */
public class NumeroComplejo {
    private double real;
    private double imag;

    /**
     * Constructor que inicializa el n.c. a cero
     *
     * @return Devuelve un número complejo
     */
    public NumeroComplejo() {
        this.real = 0;
        this.imag = 0;
    }
    /**
     * Constructor que inicializa el n.c. con dos números enteros
     *
     * @param real Número entero de la parte real
     * @param imag Número entero de la parte imaginaria
     * @return Devuelve un número complejo
     */
    public NumeroComplejo(int real, int imag) {

        this.real = real;
        this.imag = imag;
    }

    /**
     * Constructor que inicializa el n.c. con dos números decimales (double)
     *
     * @param real Número double de la parte real
     * @param imag Número double de la parte imaginaria
     * @return Devuelve un número complejo
     */
    public NumeroComplejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    /**
     * Constructor que inicializa el n.c. a partir de otro número complejo
     *
     * @param nc Número Número complejo
     * @return Devuelve un número complejo
     */
    public NumeroComplejo(NumeroComplejo nc) {
        this.real = nc.getParteReal();
        this.imag = nc.getParteImag();
    }

    /**
     * Getter para la parte real
     * @return Valor double de la parte real
     */
    public double getParteReal(){
        return this.real;
    }

    /**
     * Getter para la parte imaginaria
     * @return Valor double de la parte imaginaria
     */
    public double getParteImag(){
        return this.imag;
    }

    /**
     * Setter para la parte real
     */
    public void setParteReal(double real){
        this.real = real;
    }

    /**
     * Setter para la parte imaginaria
     */
    public void setParteImag(double imag){
        this.imag = imag;
    }

    /**
    * Metodo para la suma de dos números complejos (desde el que se invoca el método y otro)
    * @param nc Número complejo a sumar
     * @result Numero complejo resultante
     */
    public NumeroComplejo sumar(NumeroComplejo nc) {
        double realRes = this.real + nc.getParteReal();
        double imagRes = this.imag + nc.getParteImag();
        return new NumeroComplejo(realRes, imagRes);
    }

    /**
     * Metodo para la resta de dos números complejos (desde el que se invoca el método y otro)
     * @param nc Número complejo a restar
     * @result Numero complejo resultante
     */
    public NumeroComplejo restar(NumeroComplejo nc) {
        double realRes = this.real - nc.getParteReal();
        double imagRes = this.imag - nc.getParteImag();
        return new NumeroComplejo(realRes, imagRes);
    }
    /**
     * Metodo para la multiplicación de dos números complejos (desde el que se invoca el método y otro)
     * @param nc Número complejo a sumar
     * @result Numero complejo resultante
     */
    public NumeroComplejo multiplicar(NumeroComplejo nc) {
        double realRes = this.real * nc.getParteReal() - this.imag * nc.getParteImag();
        double imagRes = this.imag * nc.getParteReal() + this.real * nc.getParteImag();
        return new NumeroComplejo(realRes, imagRes);
    }

    /**
     * Metodo para la multiplicación de un número complejo y un escalar
     * @param escalar Número complejo a sumar
     * @result Numero complejo resultante
     */
    public NumeroComplejo multiplicarEscalar(double escalar){
        double realRes = this.real * escalar;
        double imagRes = this.imag * escalar;
        return new NumeroComplejo(realRes, imagRes);
    }

    /**
     * Metodo para la comparación de dos números complejos
     * @param nc Número complejo a comparar
     * @result Resultado de la comparación
     */
    public boolean comparar(NumeroComplejo nc) {
        return this.real == nc.getParteReal() && this.imag == nc.getParteImag();
    }

    /**
     * Método para ver de forma agradable el número complejo.
     * @result numero complejo en formato agradable.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(real);
        if(imag >0)
            sb.append("+").append(imag);
        else
            sb.append(imag);

        sb.append("i");
        return sb.toString();
    }
}
