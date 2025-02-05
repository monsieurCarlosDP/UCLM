package lab1;

public class NumeroNatural {

    int n;

    public int getN(){
        return this.n;
    }

    public void setN(int m){
        if(m<0)
        {
            System.out.println("El número no es correcto : "+m);
        }
        else
        {
            n = m;
        }
    }

    public void incrementar(){
        n++;
    }

    public void decrementar(){
        if(n==0)
        {
            System.out.println("No se puede decrementar más");
            return;
        }

        n--;
    }

    public boolean esPar(){
        return n%2 == 0;
    }

    public boolean esPrimo(){
        if(n<=3) return true;
        if(n==0) return false;

        for(int i=2; i<n;i++)
        {
            if(n%i==0) {
                int cociente = n/i;
                System.out.println("El número "+n+" no es primo, ya que es divisible por "+i+". Cociente="+cociente);
                return false;
            }
        }
        return true;
    }

    public boolean esPerfecto(){
        if(n<0) return false;

        int acumulador=0;

        for(int i=1; i<n;i++)
        {
            if(n%i==0) {
                acumulador+=i;
            }
        }

        return n==acumulador;

    }

    public int pow(int m)
    {
        if(n<0 || m<0) {
            System.out.println("Debe introducir un número mayor de 0");
            return n;
        }
        int acumulador=1;
        for (int i=1;i<=m;i++) {
            acumulador*=n;
        }

        return acumulador;
    }

    public double half(){

        return  n*1.0 / 2;

    }

    public NumeroNatural distancia(NumeroNatural m)
    {
        NumeroNatural d = new NumeroNatural();
        d.setN(Math.abs(m.getN()-n));
        return d;
    }

    public void syncToMinor(NumeroNatural m){
        if (m.getN()<n)
            n=m.getN();
        else
            m.setN(n);
        return;
    }
}
