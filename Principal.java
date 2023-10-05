import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashMap;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Alumno> alumnos = new HashMap<>();
        HashMap<Integer, Profesor> profesores = new HashMap<>();
        LinkedList<Grupo> grupos = new LinkedList<Grupo>();
        HashMap<Integer, Asignatura> asignaturas = new HashMap<>();
        Alumno Alumnosc;

        int op, op2, aux;
        do {
            Menucito.operaciones();
            op = sc.nextInt();
            sc.nextLine();
           switch (op) {
            case 1:
                //Crear
                Menucito.elementos();
                op2 = sc.nextInt();
                switch(op2){
                    case 1:
                        Alumnosc=Alumno.nuevo(sc);
                        alumnos.put(Alumnosc.getNumeroDeCuenta(),Alumnosc);
                        break;
                    case 2:
                        //profesor
                        System.out.println("Introduzca el identificador del nuevo profesor");
                        aux = sc.nextInt();
                        sc.nextLine();
                        if(!profesores.containsKey(aux)){
                            System.out.println("Introduzca el nombre del nuevo profesor");
                            String nombre = sc.nextLine();
                            profesores.put(aux,new Profesor(nombre,aux));   
                            System.out.println("Profesor añadido al sistema");
                        }else{
                            System.out.println("Ya hay un profesor con ese identificador");
                        }
                        break;
                    case 3:
                        //asignatura
                        System.out.println("Introduzca la clave de la nueva asignatura");
                        aux = sc.nextInt();
                        sc.nextLine();
                        if(asignaturas.containsKey(aux)){
                            System.out.println("Ya hay una materia con esa clave");
                        }else{
                            System.out.println("Introduzca las horas de la materia: ");
                            int horas = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Introduzca los creditos de la materia: ");
                            int creditos = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Introduzca el nombre de la materia: ");
                            String nombre = sc.nextLine();
                            asignaturas.put(aux,new Asignatura(aux,horas,nombre,creditos));
                        }
                        break;
                    case 4:
                        //grupo
                        System.out.println("Introduzca la clave de la asignatura");
                        int asig = sc.nextInt();
                        sc.nextLine();
                        if(!asignaturas.containsKey(asig)){
                            System.out.println("Clave no valida");
                            break;
                        }
                        System.out.println("Introduzca el identificador del docente");
                        int docente = sc.nextInt();
                        if(!profesores.containsKey(docente)){
                            System.out.println("Identificador no valido");
                            break;
                        }
                        grupos.add(new Grupo(asignaturas.get(asig),profesores.get(docente),grupos.size()));
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
                        for(Integer i : alumnos.keySet()){
                             alumnos.get(i).mostrar(asignaturas);
                            }    
                        break;
                    case 2:
                        //Profesor
                        System.out.println("Mostrando todos los profesores del sistema");
                        for(Integer i : profesores.keySet()){
                             System.out.println(profesores.get(i));
                            } 
                        break;
                    case 3:
                        //Asignatura
                        System.out.println("Mostrando todos los profesores del sistema");
                        for(Integer i : profesores.keySet()){
                             System.out.println(profesores.get(i));
                            } 
                        break;
                    case 4: 
                        System.out.println("Mostrando todos los grupos");
                        for(int i = 0; i < grupos.size(); i++){
                            System.out.println(grupos.get(i));
                            System.out.println();
                        }
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
                        System.out.println("Introduzca el numero de cuenta del alumno a eliminar:");
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
        } while(op < 4 && op > 0);

        sc.close();
    }

}
