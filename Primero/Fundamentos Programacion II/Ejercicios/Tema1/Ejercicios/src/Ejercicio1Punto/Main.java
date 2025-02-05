package Ejercicio1Punto;

public class Main {

    public static void main(String[] args) {

        Punto p1 = new Punto(3,5);
        Punto p2 = new Punto(6,10);
        Punto p3 = new Punto(0,2);
        Punto p4 = new Punto(0,0);
        Punto p5 = new Punto(0,10);
        Punto p6 = new Punto(1.5, 2.5);
        Punto p7 = new Punto(5,10);

        // Comprobación distancia
        System.out.println(p1.distancia(p2));
        System.out.println(p1.distancia(p3));
        System.out.println(p2.distancia(p3));
        System.out.println(p4.distancia(p5));
        System.out.println(p3.distancia(p5));
        System.out.println(p3.distancia(p3));

        // Es colineal
        System.out.println(p1.esColinealCon(p2,p3));
        System.out.println(p6.esColinealCon(p2,p1));
        System.out.println(p3.esColinealCon(p2,p4));
        System.out.println(p3.esColinealCon(p4,p5));
        System.out.println(p2.esColinealCon(p5,p7));
        System.out.println(p2.esColinealCon(p7,p5));
        System.out.println(p2.esColinealCon(p7,p6));
        System.out.println(p2.esColinealCon(p2,p2));

        // Es puntoMedio
        Punto m1 = p1.puntoMedio(p2);
        System.out.println("x: "+m1.getX()+" y:"+m1.getY());

        Punto m2 = p3.puntoMedio(p5);
        System.out.println("x: "+m2.getX()+" y:"+m2.getY());

        Punto m3 = p3.puntoMedio(p3);
        System.out.println("x: "+m3.getX()+" y:"+m3.getY());

        // Es toString
        System.out.println(p1.toString());

        // Equals
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p1));

    }
}
