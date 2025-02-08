package Ejercicio6Vector;

public class Main {
    public static void main(String[] args) {

        Punto p1 = new Punto(3,10);
        Punto p2 = new Punto(2.5,7);
        Vector v1 = new Vector(p1,p2);

        Punto p3 = new Punto(0,-1);
        Punto p4 = new Punto(-2,3);
        Vector v2 = new Vector(p3,p4);

        Vector v3 = v1.suma(v2);
        System.out.printf(v3.toString());
    }
}
