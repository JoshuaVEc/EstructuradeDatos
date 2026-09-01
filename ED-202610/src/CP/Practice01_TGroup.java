package CP;

import TDAs.SinglyLinkedList;

public class Practice01_TGroup {
    SinglyLinkedList<Practice01_TEstud> grupo_estudiantes;
    SinglyLinkedList<Practice01_TEstud> promedios_estudiantes;
    public Practice01_TGroup(){
        this.grupo_estudiantes=new SinglyLinkedList<>();
        this.promedios_estudiantes=new SinglyLinkedList<>();
    }

    public void addStudent(Practice01_TEstud estudiante){

        grupo_estudiantes.addLast(estudiante);
    }
    public void imprimirPromedioCadaEstudiante(){
        SinglyLinkedList<Practice01_TEstud> grupo_cada_promedio = grupo_estudiantes;
        Practice01_TEstud actual = grupo_cada_promedio.first();
        System.out.println("Promedio de los Estudiantes");

        while(actual!=null){

            System.out.println("Estudiante: " + actual.getName());
            System.out.println("Edad: " + actual.getAge());
            System.out.println("Promedio: " + actual.getPromedio());
            if(grupo_cada_promedio.first().getPromedio() >= actual.getPromedio()){
                promedios_estudiantes.addLast(actual);

            }else {
                promedios_estudiantes.addFirst(actual);
            }

            actual = grupo_cada_promedio.removeFirst();


    }
    }
    public String getBestStudent(){
        return promedios_estudiantes.first().getName();
    }





    }

