package introlab1;

public class Persona {
    String nombre;
    int edad;

    String getNombre(){
        return nombre;
    }

    int getEdad(){
        return edad;
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }

    void setEdad(int edad) {
        if(edad>=0) {
            this.edad = edad;
        }
    }

    void incrementaEdad() {
        this.edad++;
    }

    void decrementaEdad() {
        this.edad--;
    }

    boolean isMayorDeEdad() {
        return edad>=18;
    }

    int cuantoQuedaParaMayorDeEdad(){
        if(edad<18) {
            return 18 - edad;
        }

        return 0;
    }

    void diferenciaPersona(Persona persona)
    {
        if(persona.getEdad() != this.edad)
        {
            System.out.println("Las edades no coinciden: "+persona.getEdad()+"!="+this.edad);
        }

        if(!persona.getNombre().equals(this.nombre))
        {
            System.out.println("Los nombres no coinciden: "+persona.getNombre()+"!="+this.nombre);
        }
    }

}
