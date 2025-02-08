package Ejercicio3Persona;

public class Main {

    public static void main(String[] args) {
        // Dos personas con sus hijos
        Persona p1 = new Persona("Carlos", 39, 1.89f, 130, "Doctor Ferran 76", 2);
        p1.setHijos(new Persona[]{new Persona("Nico", 5, 1.3f, "Doctor Ferran 76"), new Persona("Leo", 5, 1.2f, "Doctor Ferran 76")});
        Persona p2 = new Persona("Miriam",35,1.72f, 67,"Doctor Ferran 76",3);
        p2.setHijos(new Persona[]{new Persona("Nico", 5, 1.3f, "Doctor Ferran 76"), new Persona("Leo", 5, 1.2f, "Doctor Ferran 76"),new Persona("Vega", 0, 1.2f, "Doctor Ferran 76")});

        // Mostrar toda la información
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        // Cambiar la edad, mostrar por pantalla
        p1.setEdad(40);
        System.out.println("La nueva edad de "+p1.getNombre()+" es "+p1.getEdad());

        // Obten un vector con los hijos y dibujalos por pantalla
        System.out.println(p2.getNombre()+" tiene los siguientes hijos:");
        for(Persona p : p2.getHijos()){
            System.out.println(p.toString());
        }

        // Obten la altura de la primera y la segunda persona
        System.out.println(p1.getNombre()+" mide "+p1.getAltura()+" cm");
        System.out.println(p2.getNombre()+" mide "+p2.getAltura()+" cm");

        // Crea una persona con el segundo de los constructores y muestra la información por pantalla
        Persona p3 = new Persona("Nico", 5, 1.3f, "Doctor Ferran 76");
        System.out.println(p3.toString());


    }



}
