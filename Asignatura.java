public class Asignatura{
    private int horas;
    private int clave;
    private String nombre;
    private int creditos;
    private static int numeroAsignatura=0;
    
    public Asignatura(int clave,int horas,String nombre,int creditos){
        this.clave = clave;
        this.horas = horas;
        this.nombre = nombre;
        this.creditos = creditos;
        numeroAsignatura++;
    }
    
    public Asignatura(String nombre,int creditos){
        this.nombre = nombre;
        this.creditos = creditos;
        numeroAsignatura++;
    }
    
    public int getClave(){
        return clave;
    }
    public String getNombre() {
        return nombre;
    }
    public int getHoras() {
        return horas;
    }
    public int getCreditos() {
        return creditos;
    }
    public int getNumeroAsignatura(){
        return numeroAsignatura;
    }
    public void setClave(int clave){
        this.clave = clave;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public void setHoras (int horas) {
        this.horas = horas;
    }
    public void setCreditos (int creditos) {
        this.creditos = creditos;
    }
}
