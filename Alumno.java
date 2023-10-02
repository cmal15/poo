//import java.util.LinkedList;

public class Alumno{

    private int numeroDeCuenta;
    private String nombre;
    private float calificacion;

    public Alumno(int numeroDeCuenta, String nombre){

        this.numeroDeCuenta = numeroDeCuenta;
        this.nombre = nombre;
        this.calificacion = 0f;

    }

    public static Alumno nuevo(Scanner sc){
        int numeroDeCuenta;
        String nombre;
        float calificacion;
        System.out.print("Introduzca numero de cuenta: ");
        numeroDeCuenta = sc.nextInt();
        System.out.print("Introduzca nombre: ");
        nombre = sc.nextLine();
        return new Alumno(numeroDeCuenta,nombre);
    }

    public int getNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    public String getNombre(){
        return nombre;
    }
    public float getCalificacion(){
        return calificacion;
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
    public void mostrar(){
        System.out.println("Numero de cuenta: " + this.numeroDeCuenta);
        System.out.println("Numero de nombre: " + this.nombre);
        System.out.println("Numero de promedio: " + this.promedio);
    }

}