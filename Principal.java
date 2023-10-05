import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashMap;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Alumno> alumnos = new HashMap<>();
        LinkedList<Profesor> profesores = new LinkedList<Profesor>();
        LinkedList<Grupo> grupos = new LinkedList<Grupo>();
        HashMap<Integer, Asignatura> asignaturas = new HashMap<>();

        int op, op2, aux;
        do {
            Menucito.operaciones();
            op = sc.nextInt();
           switch (op) {
            case 1:
                //Crear
                Menucito.elementos();
                op2 = sc.nextInt();
                switch(op){
                    case 1:
                        alumnos.add(Alumno.nuevo(sc));
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        //eliminar
                }
                break;
            case 2:
                //Consultar
                Menucito.elementos();
                op2 = sc.nextInt();
                switch(op2){
                    case 1:
                        //alumno
                        System.out.println("Mostrando todos los alumnos del sistema");
                        for(int i = 0; i < alumnos.size(); i++){
                            System.out.println(alumnos.get(i));
                        }                        
                        break;
                    case 2:
                        //Profesor
                        break;
                    case 3:
                        //Asignatura
                        break;
                    case 4: 
                        //grupo
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                //Modificar
                Menucito.elementos();
                op2 = sc.nextInt();
                switch(op2){
                    case 1:
                        //alumno
                        System.out.println("Introduzca el numero de cuenta del alumno a modificar");
                            aux = sc.nextInt();
                            if(alumnos.containsKey(aux)){
                                System.out.print("Introduzca el nombre: ");
                                String nombre = sc.nextLine();
                                alumnos.get(aux).setNombre(nombre);
                            }else{
                                System.out.println("No hay alumno registrado con ese numero de cuenta");
                            }
                        break;
                    case 2:
                        //Profesor
                        break;
                    case 3:
                        //Asignatura
                        break;
                    case 4: 
                        //grupo
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                //Eliminar
                Menucito.elementos();
                op2 = sc.nextInt();
                switch(op2){
                    case 1:
                        //alumno
                        System.out.println("Introduzca el numero de cuenta del alumno a eliminar:")
                        aux = sc.nextInt();
                        if(alumnos.containsKey(aux)){
                            alumnos.remove(aux);
                            System.out.println("Se elimino el alumno con el numero de cuenta: "+ aux);
                        }else{
                            System.out.println("No hay alumno registrado con ese numero de cuenta");
                        }
                        break;
                    case 2:
                        //Profesor
                        break;
                    case 3:
                        //Asignatura
                        break;
                    case 4: 
                        //grupo
                        break;
                    default:
                        break;
                }
                break;
           
            default:
                break;
           } 
        } while(op < 4);

        sc.close();
    }

}
