package Practica5;

public class Profesor{
    
    private String nombre;
    private int identificador;
    private static int numeroProfesor=0;

    public Profesor(String nombre, int identificador){
        this.nombre = nombre;
        this.identificador = identificador;
        numeroProfesor++;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador (int identificador) {
        this.identificador = identificador;
    }
    public int getNumeroProfesor() {
        return numeroProfesor;
    }
    public String toString(){
        return "\nNombre: "+ nombre+"\nIdentificador: "+identificador;
    }
}
