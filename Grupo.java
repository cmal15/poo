import java.util.LinkedList;
public class Grupo{
    private Asignatura asignatura;
    private Profesor profesor;
    private int numero;
    private LinkedList<Alumno> alumnos;
    private static int cantidad = 0;
    
    public Grupo( Asignatura asignatura,Profesor profesor,int numero){
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.numero = numero;
        alumnos = new LinkedList<Alumno>();
        cantidad++;
    }
    
    public void eliminar(){
        asignatura = null;
        profesor = null;
        //numero = null;
        alumnos = null;
        cantidad--;
    }

    public static int getCantidad(){
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

    public String toString(){
        String str = "";
        for(int i = 0; i < alumnos.size(); i++){
            str += alumnos.get(i).getNumeroDeCuenta() + ": " + alumnos.get(i).getNombre() + "\n";
        }
        return "Asignatura: " + asignatura.getnombre() +
                "\nProfesor: " + profesor.getnombre() +
                "\nNumero: " + numero + 
                "\nAlumnos:\n"+ str;
    }
}
