package lab1;

public class Main
{
    public static void main(String[] args){
        // Creo una instancia de número natural
        NumeroNatural numero1 = new NumeroNatural();
        numero1.setN(33);
        System.out.println(numero1.getN());
        numero1.setN(-33);

        numero1.incrementar();
        System.out.println(numero1.getN());

        numero1.decrementar();
        System.out.println(numero1.getN());

        numero1.setN(0);
        System.out.println(numero1.getN());

        numero1.decrementar();
        System.out.println(numero1.getN());


        System.out.println("Comprobaciones número par: \n\n");
        numero1.setN(2);
        System.out.println(numero1.esPar());

        numero1.setN(3);
        System.out.println(numero1.esPar());

        // Comprobación si es primo

        System.out.println("Comprobaciones número primo: \n\n");
        System.out.println(numero1.esPrimo());

        numero1.setN(4);
        System.out.println(numero1.esPrimo());

        numero1.setN(5);
        System.out.println(numero1.esPrimo());
        numero1.setN(7);
        System.out.println(numero1.esPrimo());

        numero1.setN(8);
        System.out.println(numero1.esPrimo());

        numero1.setN(11);
        System.out.println(numero1.esPrimo());
        numero1.setN(13);
        System.out.println(numero1.esPrimo());

        numero1.setN(111);
        System.out.println(numero1.esPrimo());
        numero1.setN(121);
        System.out.println(numero1.esPrimo());

        // Lista numeros primos
        int[] listaNumerosPrimos = {2,	3,	5,	7,	11,	13,	17,	19,	23,	29,	31,	37,	41,	43,	47,	53,	59,	61,	67,
                71,	73,	79,	83,	89,	97,	101,	103,	107,	109,	113,	127,	131,	137,	139,	149,	151,	157,	163,
                167,	173,	179,	181,	191,	193,	197,	199,	211,	223 };

        for (int i=0; i<listaNumerosPrimos.length; i++) {
            numero1.setN(listaNumerosPrimos[i]);
            System.out.println(numero1.esPrimo());
        }



        System.out.println("Comprobaciones número perfecto: \n\n");

        numero1.setN(2);
        System.out.println(numero1.esPerfecto());

        numero1.setN(6);
        System.out.println(numero1.esPerfecto());

        numero1.setN(7);
        System.out.println(numero1.esPerfecto());

        numero1.setN(28);
        System.out.println(numero1.esPerfecto());

        // En este bucle comprobamos que funciona, solo mostramos aquellos que sean perfectos.
        for (int i=1; i<10000; i++) {
            numero1.setN(i);
            if(numero1.esPerfecto()) System.out.println("El número "+i+" es perfecto");
        }

        System.out.println("Comprobación pow");
        numero1.setN(2);
        System.out.println(numero1.pow(2));
        numero1.setN(1);
        System.out.println(numero1.pow(0));
        numero1.setN(1);
        System.out.println(numero1.pow(-1));


        System.out.println("Comprobación half");
        numero1.setN(2);
        System.out.println(numero1.half());
        numero1.setN(1);
        System.out.println(numero1.half());
        numero1.setN(7);
        System.out.println(numero1.half());

        System.out.println("Comprobación distancia");

        NumeroNatural c = new NumeroNatural();
        System.out.println(numero1.distancia(c).getN());

        NumeroNatural d = new NumeroNatural();
        d.setN(10);
        numero1.setN(10);
        System.out.println(numero1.distancia(d).getN());

        NumeroNatural e = new NumeroNatural();
        e.setN(1);
        numero1.syncToMinor(e);
        System.out.println("numero1:"+numero1.getN()+" e:"+e.getN());

        NumeroNatural f = new NumeroNatural();
        f.setN(7);
        numero1.setN(5);
        numero1.syncToMinor(f);
        System.out.println("numero1:"+numero1.getN()+" f:"+f.getN());

        NumeroNatural g = new NumeroNatural();
        g.setN(5);
        numero1.setN(5);
        numero1.syncToMinor(g);
        System.out.println("numero1:"+numero1.getN()+" g:"+g.getN());
    }
}
