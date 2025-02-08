package Ejercicio4Matriz;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Matriz m1 = new Matriz(4,2.2);
        Matriz m2 = new Matriz(5);
        Matriz m3 = new Matriz(3,4);
        Matriz m4 = new Matriz(2,3,2.5);

        Matriz m8 = new Matriz(3,2,1.1);

        m1.visualizar();
        m2.visualizar();
        m3.visualizar();
        m4.visualizar();

        double[][] valores = new double[2][3];
        Random rand = new Random();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                valores[i][j] = rand.nextDouble() * 100; // Valores entre 0 y 100
            }
        }

        // Crear objeto Matriz usando el constructor
        Matriz m5 = new Matriz(valores);
        m5.visualizar();

        // Crear objeto matriz usando otra matriz
        Matriz mValores = new Matriz(valores);
        Matriz m7 = new Matriz(mValores);
        m7.visualizar();

        System.out.println(m1.getElem(0,5));

        System.out.println(m1.getElem(0,0));
        m1.setElem(0,0,10.01010);
        System.out.println(m1.getElem(0,0));

        m1.sumar(m2);
        Matriz mSuma = m1.sumar(m1);
        mSuma.visualizar();

        m1.productoEscalar(2.2);
        m1.visualizar();

        m4.producto(m8);
        m4.visualizar();

        m4.producto(m4);

        System.out.println("\nTraza");
        System.out.println(m1.traza());
        m4.traza();

        Matriz m4Transpuesta = m4.transpuesta();

        m4Transpuesta.visualizar();
    }


}
