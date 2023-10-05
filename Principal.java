import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashMap;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Alumno> alumnos = new HashMap<>();
        HashMap<Integer, Profesor> profesores = new HashMap<Profesor>();
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
                        //alumno
                        alumnos.add(Alumno.nuevo(sc));
                        break;
                    case 2:
                        //profesor
                        System.out.println("Introduzca el identificador del nuevo profesor");
                        aux = sc.nextInt();
                        if(!profesores.containsKey(aux)){
                            System.out.println("Introduzca el nombre del nuevo profesor");
                            String nombre = sc.nextLine();
                            profesor.put(aux,nombre);   
                            System.out.println("Profesor añadido al sistema");
                        }else{
                            System.out.println("Ya hay un profesor con ese identificador");
                        }
                        break;
                    case 3:
                        //asignatura
                        System.out.println("Introduzca la clave de la nueva asignatura");
                        aux = sc.nextInt();
                        if(asignaturas.containsKey(aux)){
                            System.out.println("Ya hay una materia con esa clave");
                        }else{
                            System.out.println("Introduzca las horas de la materia: ")
                            int horas = sc.nextInt();
                            System.out.println("Introduzca los creditos de la materia: ")
                            int creditos = sc.nextInt();
                            System.out.println("Introduzca el nombre de la materia: ")
                            String nombre = sc.nextLine();
                            asignaturas.put(new Asignatura(aux,horas,nombre,creditos));
                        }
                        break;
                    case 4:
                        //grupo
                        System.out.println("Introduzca la clave de la asignatura");
                        int asig = sc.nextInt();
                        if(!asignaturas.containsKey(asig)){
                            System.out.println("Clave no valida")
                            break;
                        }
                        System.out.println("Introduzca el identificador del docente");
                        int docente = sc.nextInt();
                        if(!profesores.containsKey(docente)){
                            System.out.println("Identificador no valido")
                            break;
                        }
                        grupos.add(new Grupo(asig,docente,grupos.size()))
                        break;
                    default:
                        break;
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
