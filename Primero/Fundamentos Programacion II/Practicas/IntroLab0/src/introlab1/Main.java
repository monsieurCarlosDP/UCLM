package introlab1;

public class Main {
    public static void main(String[] args){
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        p1.setNombre("Juan");
        p1.setEdad(20);
        p2.setNombre("Juanita");
        p2.setEdad(20);

        p1.diferenciaPersona(p2);
    }
}
