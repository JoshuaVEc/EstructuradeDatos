package CP;


import TDAs.SinglyLinkedList;


public class Practice01_TController {
Practice01_TGroup grupo ;
    public void añadirEstudiantes(Practice01_TEstud estudiante){
        grupo.getEstudiantes().addLast(estudiante);

    }

    public String obtenerMejorAlumno(){
        return grupo.getBestStudent();
    }

}
