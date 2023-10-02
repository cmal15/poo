import java.util.Scanner;
import java.util.LinkedList;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        LinkedList<Alumno> alumnos= new LinkedList<Alumno>();
        LinkedList<Profesor> profesores= new LinkedList<Profesor>();
        LinkedList<Grupo> grupos = new LinkedList<Grupo>();
        LinkedList<Asignatura> asignaturas = new LinkedList<Asignatura>();

        int op;
        do {
            Menucito.operaciones();
            op = sc.nextInt();
           switch (op) {
            case 1:
                //Crear
                Menucito.elementos();
                break;
            case 2:
                //Consultar
                Menucito.elementos();
                
                break;
            case 3:
                //Modificar
                Menucito.elementos();
                
                break;
            case 4:
                //Eliminar
                Menucito.elementos();

                break;
           
            default:
                break;
           } 
        } while(op < 4);

        sc.close();
    }

}
