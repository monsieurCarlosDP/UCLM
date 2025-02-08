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