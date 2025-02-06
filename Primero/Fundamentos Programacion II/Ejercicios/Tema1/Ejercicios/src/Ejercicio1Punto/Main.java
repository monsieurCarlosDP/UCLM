package Ejercicio1Punto;

public class Main {

    public static void main(String[] args) {

        Punto p1 = new Punto(3,5);
        Punto p2 = new Punto(6,10);
        Punto p3 = new Punto(0,2);
        Punto p4 = new Punto(1.5,2.5);

        // Es toString
        System.out.println("Punto 1 "+p1.toString());
        System.out.println("Punto 2 "+p2.toString());
        System.out.println("Punto 3 "+p3.toString());
        System.out.println("Punto 4 "+p4.toString());

        // Comprobación distancia
        System.out.println("Distancia entre p1 y p2"+p1.distancia(p2));
        System.out.println("Distancia entre p1 y p3"+p1.distancia(p3));
        System.out.println("Distancia entre p2 y p3"+p2.distancia(p3));
        System.out.println("Distancia entre p2 y p4"+p2.distancia(p4));

        // Es colineal
        System.out.println("¿P1, P2 o P3 son colineales? "+p1.esColinealCon(p2,p3));
        System.out.println("¿P3, P2 o P4 son colineales? "+p3.esColinealCon(p2,p4));
        System.out.println("¿P3, P4 o P1 son colineales? "+p3.esColinealCon(p4,p1));
        System.out.println("¿P2, P2 o P2 son colineales? "+p1.esColinealCon(p2,p4));

        // Es puntoMedio
        Punto m1 = p1.puntoMedio(p2);
        System.out.println("Punto medio entre p1 y p2 - x: "+m1.getX()+" y:"+m1.getY());

        Punto m2 = p3.puntoMedio(p4);
        System.out.println("Punto medio entre p3 y p4 - x: "+m2.getX()+" y:"+m2.getY());

        Punto m3 = p3.puntoMedio(p3);
        System.out.println("Punto medio entre p3 y p3 - x: "+m3.getX()+" y:"+m3.getY());

        // Equals
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p1));

    }
}
