package Libro;

import java.util.Arrays;

public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas = 0;
    private int anioPublicacion;
    private String isbn;
    private String[] paginas;
    private int paginaActual = 0;

    public Libro(String titulo, String autor, int anioPublicacion, String isbn, String[] paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
        this.paginas = paginas;
        this.numPaginas = paginas.length;
    }

    String getTitulo(){
        return titulo;
    }

    String getAutor(){
        return autor;
    }

    int getNumPag(){
        return numPaginas;
    }

    int getAnioPublicacion(){
        return anioPublicacion;
    }

    String getIsbn(){
        return isbn;
    }

    void setTitulo(String titulo){
        this.titulo = titulo;
    }

    void setAutor(String autor){
        this.autor = autor;
    }

    void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }

    void setIsbn(String isbn){
        this.isbn = isbn;
    }

    void insertarPagina(String pagina, int posicion){

        if(posicion < 0 || posicion > this.paginas.length-1)
        {
            System.out.println("Indica una posición válida para insertar la página");
            return;
        }


        String[] arrayDer = new String[this.paginas.length-posicion];
        String[] nuevoArrayCompleto = Arrays.copyOf(this.paginas, this.paginas.length+1);
        System.arraycopy(this.paginas, posicion, nuevoArrayCompleto, posicion+1, this.paginas.length-posicion);
        nuevoArrayCompleto[posicion] = pagina;
        this.paginas = nuevoArrayCompleto;
        numPaginas++;

    }

    String leerPagina()
    {
        if(this.paginaActual <= this.paginas.length-1) {
            String pagina = this.paginas[this.paginaActual];
            this.paginaActual++;
            return pagina;
        } else if ( this.paginaActual > this.paginas.length-1) {
            return this.paginas[this.paginas.length-1];
        }
        else
        {
            return this.paginas[0];
        }
    }

    void sustituirPagina(String pagina, int posicion)
    {
        if (posicion >= 0 || posicion <= this.paginas.length-1)
        {
            this.paginas[posicion] = pagina;
        }
        else
        {
            System.out.println("Proporciona una posicion valida");
        }
    }

    void volverAlPrincipio(){
        this.paginaActual = 0;
    }

    void borrarPagina(int posicion){
    // Revisar, borra uno de mas
        String[] arrayDer = new String[this.paginas.length-posicion];
        String[] nuevoArrayCompleto = Arrays.copyOf(this.paginas, this.paginas.length-1);
        System.arraycopy(this.paginas, posicion+1, nuevoArrayCompleto, posicion, this.paginas.length-posicion-1);
        this.paginas = nuevoArrayCompleto;
        numPaginas--;

    }

    Libro unirCon(Libro libroUnion){
        if(!libroUnion.getAutor().equals(this.autor))
        {
            System.out.println("No se pueden unir libros con autores diferentes");
            return libroUnion;
        }
        int pos = this.paginas.length;
        this.paginas = Arrays.copyOf(this.paginas, this.paginas.length+libroUnion.getNumPag());
        System.arraycopy(libroUnion.paginas, 0, this.paginas, pos, libroUnion.getNumPag());
        numPaginas += libroUnion.getNumPag();
        return this;



    }


}
