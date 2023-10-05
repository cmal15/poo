public class Profesor{
    
    private String nombre;
    private int identificador;

    public Profesor(String nombre, int identificador){
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public String getnombre() {
        return nombre;
    }
    public void setnombre (String nombre) {
        this.nombre = nombre;
    }
}