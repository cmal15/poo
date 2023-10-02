//import java.util.LinkedList;

public class Alumno{

    private int numeroDeCuenta;
    private String nombre;
    private float calificacion;

    public Alumno(int numeroDeCuenta, String nombre, float calificacion){

        this.numeroDeCuenta = numeroDeCuenta;
        this.nombre = nombre;
        this.calificacion = 0f;

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
    

}