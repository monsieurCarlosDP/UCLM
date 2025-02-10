package lab2;

public class Main {

    public static void main(String[] args) {

        NumeroComplejo nc1 = new NumeroComplejo();
        NumeroComplejo nc2 = new NumeroComplejo(2,3);
        NumeroComplejo nc3 = new NumeroComplejo(2.1,3.3);
        NumeroComplejo nc4 = new NumeroComplejo(nc2);
        NumeroComplejo nc5 = new NumeroComplejo(5,10);

        // TO STRING
        System.out.println(nc1.toString());
        System.out.println(nc2.toString());
        System.out.println(nc3.toString());
        System.out.println(nc4.toString());

        // SUMAR
        System.out.println("\n\n\nSUMAR");
        System.out.println(nc1.sumar(nc2).toString());
        System.out.println(nc2.sumar(nc3).toString());
        System.out.println(nc3.sumar(nc4).toString());

        // MULTIPLICAR
        System.out.println("\n\n\nMULTIPLICAR");
        System.out.println(nc1.multiplicar(nc2).toString());
        System.out.println(nc2.multiplicar(nc3).toString());
        System.out.println(nc2.multiplicar(nc5).toString());

        // MULTIPLICAR ESCALAR
        System.out.println(nc2.multiplicarEscalar(3).toString());
        System.out.println(nc5.multiplicarEscalar(5).toString());

        // VARIOS NUMEROS COMPLEJOS
        VariosNumComplejos vnc = new VariosNumComplejos(10);
        System.out.println("Suma de complejos: "+vnc.sumaTodos().toString());
        System.out.println(vnc.toString());
    }
}
