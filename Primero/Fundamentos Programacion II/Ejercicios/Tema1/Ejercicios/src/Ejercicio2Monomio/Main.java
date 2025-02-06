package Ejercicio2Monomio;

public class Main {

    public static void main(String[] args) {


        // Apartado 1
        Monomio m1 = new Monomio(3, 5);

        System.out.println(m1.getCoeficiente());
        System.out.println(m1.getExponente());

        System.out.println(m1.toString());

        // Apartado 2
        Monomio m2 = new Monomio(5, 5);
        Monomio m3 = new Monomio(2, 4);

        System.out.println(m2.suma(m3));
        System.out.println(m1.suma(m3));
        System.out.println(m1.suma(m2));

        System.out.println(m2.multiplicacion(m3));
        System.out.println(m1.multiplicacion(m3));
        System.out.println(m1.multiplicacion(m2));

        System.out.println(m1.evaluar(2));
        System.out.println(m2.evaluar(2));
        System.out.println(m3.evaluar(2));
        System.out.println(m3.evaluar(0));

        Monomio m4 = new Monomio(1, 0);
        System.out.println(m4.evaluar(1));

        Monomio m5 = new Monomio(0, 1);
        System.out.println(m5.evaluar(1));
    }
}
