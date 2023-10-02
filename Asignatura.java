public class Asignatura{
    private int horas;
    private String nombre;
    private int creditos;
    public Asignatura(int horas,String nombre,int creditos){
        this.horas = horas;
        this.nombre = nombre;
        this.creditos = creditos;
    }
    public Asignatura(String nombre,int creditos){
        this.nombre = nombre;
        this.creditos = creditos;
    }
    public String getnombre() {
        return nombre;
    }
    public int gethoras() {
        return horas;
    }
    public int getcreditos() {
        return creditos;
    }
    public void setnombre (String nombre) {
        this.nombre = nombre;
    }
    public void sethoras (int horas) {
        this.horas = horas;
    }
    public void setcreditos (int creditos) {
        this.creditos = creditos;
    }
}