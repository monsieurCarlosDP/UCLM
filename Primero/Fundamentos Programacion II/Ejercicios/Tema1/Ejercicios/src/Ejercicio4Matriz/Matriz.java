package Ejercicio4Matriz;

import java.util.Arrays;

public class Matriz {
    int nFilas, nColumnas;
    double[][] valores;

    public Matriz(int n) {
        nFilas = n;
        nColumnas = n;
        valores = new double[nFilas][nColumnas];
    }

    public Matriz(int n, double val)
    {
        nFilas = n;
        nColumnas = n;
        valores = new double[nFilas][nColumnas];

        for(double[] fila: valores)
        {
            Arrays.fill(fila, val);
        }

    }

    public Matriz(int nFilas, int nColumnas) {
        this.nFilas = nFilas;
        this.nColumnas = nColumnas;
        valores = new double[nFilas][nColumnas];
    }

    public Matriz(int nFilas, int nColumnas, double val) {
        this.nFilas = nFilas;
        this.nColumnas = nColumnas;
        this.valores = new double[nFilas][nColumnas];
        for(double[] fila: valores)
        {
            Arrays.fill(fila, val);
        }

    }

    public Matriz(double[][] valores) {
        nFilas = valores.length;
        nColumnas = valores[0].length;
        this.valores = valores;
    }

    public Matriz(Matriz otra)
    {
        this.nFilas = otra.nFilas;
        this.nColumnas = otra.nColumnas;
        this.valores = new double[nFilas][nColumnas];
        for (int i = 0; i < nFilas; i++) {
            System.arraycopy(otra.valores[i], 0, this.valores[i], 0, nColumnas);
        }

    }

    public double getElem(int i, int j) {
        if(i>=nFilas || j>=nColumnas || i<0 || j<0) {
            System.out.println("Los indices no son válidos");
            return 0;
        }

        return valores[i][j];
    }

    public void setElem(int i, int j, double val) {
        if(i>=nFilas || j>=nColumnas || i<0 || j<0) {
            System.out.println("Los indices no son válidos");
            return;
        }
        valores[i][j] = val;
    }

    public Matriz sumar(Matriz otra) {
        Matriz resultado = new Matriz(nFilas, nColumnas);
        if(otra.nFilas == nFilas && otra.nColumnas == nColumnas) {
            for(int i=0; i<nFilas; i++) {
                for(int j=0; j<nColumnas; j++) {
                    resultado.setElem(i, j, otra.valores[i][j]+this.valores[i][j]);
                }
            }
            return resultado;
        }
        else
        {
            System.out.println("No se puede realizar la operación");
        }
        return null;
    }

    public void producto(Matriz otra) {
        if(otra.nFilas == nColumnas && otra.nColumnas == nFilas) {
            for(int i=0; i<nFilas; i++) {
                for(int j=0; j<nColumnas; j++) {
                    this.setElem(i, j, otra.valores[j][i]*this.valores[i][j]);
                }
            }
        }
        else{
            System.out.println("No se puede realizar la operacion");
        }
    }

    public void productoEscalar(double escalar)
    {
        for(int i=0; i<nFilas; i++) {
            for(int j=0; j<nColumnas; j++) {
                this.setElem(i, j, escalar*this.valores[i][j]);
            }
        }
    }

    public double traza(){
        if(nFilas != nColumnas) {
            System.out.println("No se puede realizar la traza de una matriz no cuadrada");
            return 0;
        }
        else
        {
            double acc=0;
            for(int i=0; i<nFilas; i++) {

                    acc += this.valores[i][i];

            }
            return acc;
        }
    }

    public Matriz transpuesta(){
        int nFilasTranspuesta = this.nColumnas;
        int nColumnasTranspuesta = this.nFilas;
        Matriz resultado = new Matriz(nFilasTranspuesta, nColumnasTranspuesta);
        for(int i=0; i<nFilas; i++) {
            for(int j=0; j<nColumnas; j++) {
                resultado.setElem(j, i, this.valores[i][j]);
            }
        }
        return resultado;
    }

    public void visualizar(){
        System.out.println("\n");
        for( int fila = 0; fila < nFilas; fila++)
        {
            StringBuilder valoresFila = new StringBuilder("");
            for (int columna = 0; columna < nColumnas; columna++){
                valoresFila.append(" "+valores[fila][columna]+" ");
            }
            System.out.println(valoresFila+"\n");
        }
    }


}
