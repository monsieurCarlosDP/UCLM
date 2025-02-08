package Ejercicio3Persona;

public class Persona {

    String nombre;
    int edad;
    float altura;
    float peso;
    String direccion;
    Persona[] hijos;

    public Persona(String nombre, int edad, float altura, float peso, String direccion, int hijos) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.direccion = direccion;
        this.hijos = new Persona[hijos];
    }

    public Persona(String nombre, int edad, float altura, String direccion) {
        this(nombre,edad,altura,0.0f,direccion,0);
    }

    public void anadirHijo(Persona hijo) {
        Persona[] nuevosHijos = new Persona[this.hijos.length+1];
        System.arraycopy(this.hijos,0,nuevosHijos,0,this.hijos.length);
        nuevosHijos[this.hijos.length] = hijo;
        this.hijos = nuevosHijos;
    }

    public Persona obtenerMayor(){
        Persona mayor = this.hijos[0];
        for ( Persona hijo : this.hijos ) {
            if ( hijo != null && hijo.edad > mayor.edad ) {
                mayor = hijo;
            }
        }
        return mayor;
    }

    public Persona obtenerMenor(){
        Persona menor = this.hijos[0];
        for ( Persona hijo : this.hijos ) {
            if ( hijo != null && hijo.edad < menor.edad ) {
                menor = hijo;
            }
        }
        return menor;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if(edad < 0) {
            System.out.println("No se aceptan edades negativas");
            return;
        }
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura < 0) {
            System.out.println("No se aceptan alturas negativas");
            return;
        }
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso < 0) {
            System.out.println("No se aceptan pesos negativas");
            return;
        }
        this.peso = peso;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Persona[] getHijos() {
        if(hijos.length == 0) {
            System.out.println("No hay hijos.");
            return null;
        }
        return hijos;
    }
    public void setHijos(Persona[] hijos) {
        if(hijos == null) {
            System.out.println("No se aceptan los hijos con valor null");
            return;
        }
        if(hijos.length == 0) {
            System.out.println("No se aceptan los hijos con valor 0");
            return;
        }
        if(hijos.length != this.hijos.length) {
            System.out.println("No se aceptan los hijos con valor distinto al de construcción: "+this.hijos.length);
        }
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        StringBuilder data = new StringBuilder("Nombre: " + nombre + "\n" + "Edad: " + edad + "\nAltura: " + edad + "\nPeso: " + peso + "\nDireccion: " + direccion + "\n\n");

        if (hijos != null) {
            data.append("\n\n").append(nombre).append(" tiene ").append(hijos.length).append(" hijos.\n\n");
            for (Persona hijo : hijos) {
                if (hijo!= null)
                    data.append(hijo.toString());
            }
        }

        return data.toString();
    }

}


