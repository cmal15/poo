package Practica5;

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
                sc.nextLine();
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
                        sc.nextLine();
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
                sc.nextLine();
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
                        System.out.println("Mostrando todas las asignaturas del sistema");
                        for(Integer i : asignaturas.keySet()){
                             System.out.println(asignaturas.get(i));
                            } 
                        break;
                    case 4: 
                        //grupo
                        System.out.println("Mostrando todos los grupos");
                        for(int i = 0; i < grupos.size(); i++){
                            System.out.println(grupos.get(i));
                            System.out.println();
                        }
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                //Modificar
                Menucito.elementos();
                op2 = sc.nextInt();
                sc.nextLine();
                switch(op2){
                    case 1:
                        //alumno
                        System.out.println("Introduzca el numero de cuenta del alumno a modificar");
                            aux = sc.nextInt();
                            sc.nextLine();
                            if(alumnos.containsKey(aux)){
                                System.out.print("Introduzca el nombre: ");
                                String nombre = sc.nextLine();
                                alumnos.get(aux).setNombre(nombre);
                                do{
                                    System.out.println("1.Añadir calificacion\t2.Salir del menu");
                                    op2 = sc.nextInt();
                                    if(op2 == 1){
                                        System.out.println("Introduzca la clave de la calificaicon");
                                        int clave = sc.nextInt();
                                        if(asignaturas.containsKey(clave)){
                                            System.out.println("Introduzca la calificacion");
                                            double calificacion = sc.nextInt();
                                            alumnos.get(aux).addCalificacion(clave, calificacion);
                                        }else{
                                            System.out.println("Clave invalida");
                                        }
                                    }
                                    sc.nextLine();
                                }while(op2 != 1);
                            }else{
                                System.out.println("No hay alumno registrado con ese numero de cuenta");
                            }
                        break;
                    case 2:
                        //Profesor
                        System.out.println("Introduzca el identificador del profesor a modificar");
                        aux = sc.nextInt();
                        sc.nextLine();
                        if(profesores.containsKey(aux)){
                            System.out.println("Introduzca el nombre modificado");
                            String nombre = sc.nextLine();
                            profesores.get(aux).setNombre(nombre);
                        }else{
                            System.out.println("Identificador invalido");
                        }
                        break;
                        case 3:
                        //Asignatura
                        System.out.println("Introduzca la clave de la asignatura");
                        aux = sc.nextInt();
                        sc.nextLine();
                        if(asignaturas.containsKey(aux)){
                            System.out.println("Introduzca el nombre");
                            String nombre = sc.nextLine();
                            System.out.println("Introduzca las horas");
                            int horas = sc.nextInt();
                            System.out.println("Introduzca los creditos");
                            int creditos = sc.nextInt();
                            sc.nextLine();
                            asignaturas.get(aux).setNombre(nombre);
                            asignaturas.get(aux).setHoras(horas);
                            asignaturas.get(aux).setCreditos(creditos);
                            System.out.println("Se modificaron los datos de la asignatura");
                        }else{
                            System.out.println("No hay asignatura con la clave dada");
                        }
                        break;
                    case 4: 
                        //grupo
                        System.out.println("Introduzca el numero de grupo");
                        aux = sc.nextInt();
                        sc.nextLine();
                        if(grupos.size() < --aux){
                            System.out.println("Grupo no registrado");
                            break;
                        }
                        System.out.println("Introduzca el identificador del profesor");
                        int doc = sc.nextInt();
                        sc.nextLine();
                        if(profesores.containsKey(doc)){
                            grupos.get(aux).setProfesor(profesores.get(doc));
                        }
                        do{
                            System.out.println("1.Modificar alumnos\t2.Salir del menu");
                            op = sc.nextInt();
                            sc.nextLine();
                            if(op == 1){
                                System.out.println("Introduzca un numero de cuenta, si no esta registrado se registrara, en caso contrario se eliminara");
                                int num = sc.nextInt();
                                sc.nextLine();
                                if(alumnos.containsKey(num)){
                                    if(grupos.get(aux).getAlumnos().contains(alumnos.get(num))){
                                        grupos.get(aux).getAlumnos().remove(alumnos.get(num));
                                    }else{
                                        grupos.get(aux).getAlumnos().add(alumnos.get(num));
                                    }
                                }else{
                                    System.out.println("Numero de cuenta invalido");
                                } 
                            }
                        }while(op == 1);
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                //Eliminar
                Menucito.elementos();
                op2 = sc.nextInt();
                sc.nextLine();
                switch(op2){
                    case 1:
                        //alumno
                        System.out.println("Introduzca el numero de cuenta del alumno a eliminar:");
                        aux = sc.nextInt();
                        sc.nextLine();
                        if(alumnos.containsKey(aux)){
                            alumnos.remove(aux);
                            System.out.println("Se elimino el alumno con el numero de cuenta: "+ aux);
                        }else{
                            System.out.println("No hay alumno registrado con ese numero de cuenta");
                        }
                        break;
                    case 2:
                        //Profesor
                        System.out.println("Introduzca el numero identificador del profesor a eliminar:");
                        aux = sc.nextInt();
                        sc.nextLine();
                        if(profesores.containsKey(aux)){
                            profesores.remove(aux);
                            System.out.println("Se elimino el profesor con el identificador: "+ aux);
                        }else{
                            System.out.println("No hay profesor registrado con ese identificador");
                        }
                        break;
                    case 3:
                        //Asignatura
                        System.out.println("Introduzca la clave de la asignatura a eliminar:");
                        aux = sc.nextInt();
                        sc.nextLine();
                        if(asignaturas.containsKey(aux)){
                            asignaturas.remove(aux);
                            System.out.println("Se elimino la asignatura con la clave: "+ aux);
                        }else{
                            System.out.println("No hay asignatura registrada con esa clave");
                        }
                        break;
                    case 4: 
                        //grupo
                        System.out.println("Esto solo vaciara los datos del grupo");
                        System.out.println("Introduzca el numero del grupo:");
                        aux = sc.nextInt();
                        sc.nextLine();
                        if(aux < grupos.size()){
                            grupos.get(aux).setAsignatura(null);
                            grupos.get(aux).setProfesor(null);
                            grupos.get(aux).setAlumnos(null);
                            System.out.println("Se vaciaron los datos del grupo");
                        }
                        break;
                    default:
                        break;
                }
                break;
           
            default:
                break;
           } 
        } while(op <= 4 && op > 0);

        sc.close();
    }

}
