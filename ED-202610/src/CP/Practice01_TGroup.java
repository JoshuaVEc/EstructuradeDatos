package CP;

import TDAs.SinglyLinkedList;

public class Practice01_TGroup {
    SinglyLinkedList<Practice01_TEstud> grupo_estudiantes;
    SinglyLinkedList<Practice01_TEstud> promedios_estudiantes;

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
    public void addEstudent(Practice01_TEstud estudiante){
        grupo_estudiantes.addLast(estudiante);
    }

    public SinglyLinkedList<Practice01_TEstud> getEstudiantes(){
        return grupo_estudiantes;
    }


    }

