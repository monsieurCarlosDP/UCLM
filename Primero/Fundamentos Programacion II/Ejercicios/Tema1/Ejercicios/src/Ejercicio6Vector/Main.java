package Ejercicio6Vector;

public class Main {
    public static void main(String[] args) {

        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(1,2);
        Punto p3 = new Punto(2,-1);
        Punto p4 = new Punto(3,2);
        Punto p5 = new Punto(-3,-2);

        // Definimos 5 vectores
        Vector v1 = new Vector(p1,p2);
        Vector v2 = new Vector(p2,p3);
        Vector v3 = new Vector(p3,p1);
        Vector v4 = new Vector(p1,p4);
        Vector v5 = new Vector(p5,p1);

        System.out.println("V1: " + v1.toString());
        System.out.println("V2: " + v2.toString());
        System.out.println("V3: " + v3.toString());
        System.out.println("v4: " + v4.toString());
        System.out.println("v5: " + v5.toString());

// SUMAS de vectores
        System.out.println("Suma V1 + V2 "+v1.suma(v2).toString());
        System.out.println("Suma V1 + V3 "+v1.suma(v3).toString());
        System.out.println("Suma V1 + V4"+v1.suma(v4).toString());
        System.out.println("Suma V1 + V5 "+v1.suma(v5).toString());

    // RESTAS de vectores
        System.out.println("Resta V1 - V2 "+v1.resta(v2).toString());
        System.out.println("Resta V1 - V3 "+v1.resta(v3).toString());
        System.out.println("Resta V1 - V4 "+v1.resta(v4).toString());
        System.out.println("Resta V1 - V5 "+v1.resta(v5).toString());

    // PRODUCTO ESCALAR de vectores
        System.out.println("Producto escalar v1 y v1: "+v1.productoEscalar(v1));
        System.out.println("Producto escalar v1 y v2: "+v1.productoEscalar(v2));
        System.out.println("Producto escalar v1 y v3: "+v1.productoEscalar(v3));
        System.out.println("Producto escalar v1 y v4: "+v1.productoEscalar(v4));
        System.out.println("Producto escalar v1 y v5: "+v1.productoEscalar(v5));

    // Baricentro
        System.out.println("Baricentro v1, v2 y v3 "+ v1.baricentro(v2,v3));
        System.out.println("Baricentro v3, v4 y v5: "+ v3.baricentro(v4,v5));
        System.out.println("Baricentro v1, v3 y v4: "+ v1.baricentro(v5,v3));

    // es igual?
        System.out.println("Es igual? v1 y v1: "+ v1.equals(v1));
        System.out.println("Es igual? v1 y v2: "+ v1.equals(v2));
        System.out.println("Es igual? v1 y v3: "+ v1.equals(v3));
        System.out.println("Es igual? v1 y v4: "+ v1.equals(v4));
        System.out.println("Es igual? v1 y v5: "+ v1.equals(v5));


    }
}
