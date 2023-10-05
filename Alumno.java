//import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;

public class Alumno{

    private int numeroDeCuenta;
    private String nombre;
    private  HashMap<Integer, double> calificaciones;
    private double promedio;
    private static int numeroAlumnos=0;

    public Alumno(int numeroDeCuenta, String nombre){

        this.numeroDeCuenta = numeroDeCuenta;
        this.nombre = nombre;
        this.promedio = 0f;
        calificaciones = new HashMap<>();
        numeroAlumnos++;
    }

    public static Alumno nuevo(Scanner sc){
        int numeroDeCuenta;
        String nombre;
        System.out.print("Introduzca numero de cuenta: ");
        numeroDeCuenta = sc.nextInt();
        System.out.print("Introduzca nombre: ");
        nombre = sc.nextLine();
        return new Alumno(numeroDeCuenta,nombre);
    }

    public int getNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    public int getnumeroAlumnos(){
        return numeroAlumnos;
    }
    public String getNombre(){
        return nombre;
    }
    public HashMap<Integer, double> getCalificaciones(){
        return calificaciones;
    }
    public void setNumeroDeCuenta(int numeroDeCuenta){
        this.numeroDeCuenta =  numeroDeCuenta;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCalificacion(float calificacion){
        this.calificacion = calificacion;
    }

    public void addCalificacion(int claveAsignatura, double calificacion){
        calificaciones.put(claveAsignatura, calificacion);
        double suma = 0;
        for(double i: calificaciones.entrySet()){
            suma += i;
        }
        promedio = suma/calificaciones.size();
    }

    public void mostrar(HashMap<Integer , Asignatura> asignaturas){
        System.out.println("Numero de cuenta: " + this.numeroDeCuenta);
        System.out.println("Numero de nombre: " + this.nombre);
        System.out.println("Numero de promedio: " + this.promedio);
        System.out.println("Calificaciones:");
        for(Integer i : calificaciones.keySet){
            System.out.println(asignaturas.get(i).getNombre() + ": " + calificaciones.get(i));
        }
    }
    
    public String toString(){
        return "\nNombre: "+ nombre+"\nIdentificador: "+identificador;
    }

}
