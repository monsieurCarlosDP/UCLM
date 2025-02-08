package Ejercicio6Vector;

public class Punto {

    private double x=0,y=0;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    double distancia(Punto p) {
        return Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));
    }

    boolean esColinealCon(Punto p1, Punto p2) {
        // Comprobamos un caso particular: si la x es la misma en algun punto, ya que en ese caso la pendiente es infinita y nos puede dar problemas

        if((this.x == p1.getX() && this.x == p2.getX()) || (this.y == p1.getY() && this.y == p2.getY()))
            return true;

        if((this.x == p1.getX() && this.x != p2.getX()) || (this.x != p1.getX() && this.x == p2.getX()) || (this.y == p1.getY() && this.y != p2.getY()) || (this.y != p1.getY() && this.y == p2.getY()))
            return false;


        double pendiente1 = (this.y - p1.getY()) / (this.x - p1.getX());
        double pendiente2 = (this.y - p2.getY()) / (this.x - p2.getX());

        return pendiente1 == pendiente2;


    }

    Punto puntoMedio(Punto p1){
        if(p1.getX() == this.x && p1.getY() == this.y)
            return p1;

        return new Punto((this.x + p1.getX())/2, (this.y + p1.getY())/2);

    }
    @Override
    public String toString(){
        return "x: "+x+" y: "+y;
    }

    boolean equals(Punto p){
        return this.x == p.getX() && this.y == p.getY();
    }



}
