import java.util.LinkedList;
public class Grupo{
    private Asignatura asignatura;
    private Profesor profesor;
    private int numero;
    private LinkedList<Alumno> alumnos;
    private static int cantidad = 0;
    
    public Grupo( Asignatura asignatura,Profesor profesor,int numero,LinkedList<Alumno> alumnos){
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.numero = numero;
        this.alumnos = alumnos;
        cantidad++;
    }

    public Grupo( Asignatura asignatura,Profesor profesor,int numero){
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.numero = numero;
        cantidad++;
    }
    
    public static getCantidad(){
        return cantidad;
    }

    public Asignatura setAsignatura() {
        return asignatura;
    }

    public Profesor setprofesor() {
        return profesor;
    }
    public int setnumero() {
        return numero;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Profesor getprofesor() {
        return profesor;
    }
    public int getnumero() {
        return numero;
    }
}