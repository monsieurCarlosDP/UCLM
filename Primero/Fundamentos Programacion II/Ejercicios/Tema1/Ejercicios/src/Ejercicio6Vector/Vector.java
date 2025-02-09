package Ejercicio6Vector;

public class Vector {
    private Punto puntoOrigen, puntoDestino;

    public Vector(Punto puntoOrigen, Punto puntoDestino) {
        this.puntoOrigen = puntoOrigen;
        this.puntoDestino = puntoDestino;
    }

    public Punto getPuntoDestino() {
        return puntoDestino;
    }

    public void setPuntoDestino(Punto puntoDestino) {
        this.puntoDestino = puntoDestino;

    }

    public Punto getPuntoOrigen() {
        return puntoOrigen;
    }

    public void setPuntoOrigen(Punto puntoOrigen) {
        this.puntoOrigen = puntoOrigen;
    }

    public Vector suma(Vector v) {
        double xOrigen = this.getPuntoOrigen().getX();
        double yOrigen = this.getPuntoOrigen().getY();
        double xDestino = this.getPuntoDestino().getX();
        double yDestino = this.getPuntoDestino().getY();

        double xDestinoV = v.getPuntoDestino().getX();
        double yDestinoV = v.getPuntoDestino().getY();

        Punto nuevoOrigen = new Punto(xOrigen, yOrigen); // Se mantiene el mismo origen
        Punto nuevoDestino = new Punto(xDestino + (xDestinoV - v.getPuntoOrigen().getX()),
                yDestino + (yDestinoV - v.getPuntoOrigen().getY()));

        return new Vector(nuevoOrigen, nuevoDestino);
    }

    public Vector resta(Vector v) {
        double xOrigen = this.getPuntoOrigen().getX();
        double yOrigen = this.getPuntoOrigen().getY();
        double xDestino = this.getPuntoDestino().getX();
        double yDestino = this.getPuntoDestino().getY();

        double xOrigenV = v.getPuntoOrigen().getX();
        double yOrigenV = v.getPuntoOrigen().getY();
        double xDestinoV = v.getPuntoDestino().getX();
        double yDestinoV = v.getPuntoDestino().getY();

        double dx1 = xDestino - xOrigen;
        double dy1 = yDestino - yOrigen;
        double dx2 = xDestinoV - xOrigenV;
        double dy2 = yDestinoV - yOrigenV;

        double dxResult = dx1 + (-dx2); // Equivalente a dx1 - dx2
        double dyResult = dy1 + (-dy2); // Equivalente a dy1 - dy2

        // Nuevo vector: mismo origen y destino en (origen + desplazamiento resultante)
        Punto nuevoOrigen = new Punto(xOrigen, yOrigen);
        Punto nuevoDestino = new Punto(xOrigen + dxResult, yOrigen + dyResult);
        return new Vector(nuevoOrigen, nuevoDestino);

    }

    // El baricentro de tres puntos es relativamente sencillo (analíticamente hablando), pero he tenido problemas
    // para definir el de 3 vectores.
    // Según he visto, para el baricentro de 3 vectores bastaría con sumar sus desplazamientos x e y, y dividirlos
    // entre 3. Ya que no tenemos sus desplazamientos, sino solo sus puntos origen y destino, entiendo que
    // sería igual sumar sus coordenadas x e y, dividirlas por 3 y hacer su desplazamiento.

    public Punto baricentro(Vector vA, Vector vB) {
        double xO = this.getPuntoOrigen().getX() + vA.getPuntoOrigen().getX() + vB.getPuntoOrigen().getX();
        double y0 = this.getPuntoOrigen().getY() + vA.getPuntoOrigen().getY() + vB.getPuntoOrigen().getY();
        double xD = this.getPuntoDestino().getX() + vA.getPuntoDestino().getX() + vB.getPuntoDestino().getX();
        double yD = this.getPuntoDestino().getY() + vA.getPuntoDestino().getY() + vB.getPuntoDestino().getY();
        return new Punto(xO/3, y0/3);
    }

    public double productoEscalar(Vector v){
        double dx1 = this.getPuntoDestino().getX() - this.getPuntoOrigen().getX();
        double dy1 = this.getPuntoDestino().getY() - this.getPuntoOrigen().getY();

        double dx2 = v.getPuntoDestino().getX() - v.getPuntoOrigen().getX();
        double dy2 = v.getPuntoDestino().getY() - v.getPuntoOrigen().getY();

        return dx1 * dx2 + dy1 * dy2;
    }

    // Nos piden que sea un objeto, y que si es de tipo vector, entonces, devuelva el resultado de la comparación:
    public boolean equals(Object v) {

    if (v instanceof Vector vF)
        return vF.getPuntoOrigen() == this.getPuntoOrigen() && vF.getPuntoDestino() == this.getPuntoDestino();

    System.out.printf("El objeto no es un vector");
    return false;


    }


    @Override
    public String toString() {
        StringBuilder data =  new StringBuilder();
        data.append("Punto de Origen: ").append(this.getPuntoOrigen().toString()).append(" ");
        data.append("Punto de Destino: ").append(this.getPuntoDestino().toString()).append(" ");
        double xVector = this.getPuntoDestino().getX() - this.getPuntoOrigen().getX();
        double yVector = this.getPuntoDestino().getY() - this.getPuntoOrigen().getY();
        data.append("Vector: x: ").append(xVector).append(" y:").append(yVector);
        return data.toString();

    }
}