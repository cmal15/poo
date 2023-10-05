public class Profesor{
    
    private String nombre;
    private int identificador;
    private static int numeroProfesor=0;

    public Profesor(String nombre, int identificador){
        this.nombre = nombre;
        this.identificador = identificador;
        numeroProfesor++;
    }

    public String getnombre() {
        return nombre;
    }
    public void setnombre (String nombre) {
        this.nombre = nombre;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador (int identificador) {
        this.identificador = identificador;
    }
    public int getnumeroProfesor() {
        return numeroProfesor;
    }
    public String toString(){
        return "\nNombre: "+ nombre+"\nIdentificador: "+identificador;
    }
}
