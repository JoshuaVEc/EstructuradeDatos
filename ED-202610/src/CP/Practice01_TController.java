package CP;


public class Practice01_TController {
Practice01_TGroup grupo ;

    public Practice01_TController(){
        this.grupo =new Practice01_TGroup();
    }
    public void anadirEstudiantes(Practice01_TEstud estudiante){
        grupo.addStudent(estudiante);

    }

    public String obtenerMejorAlumno(){
        return grupo.getBestStudent();
    }

    public void imprimirPromedioEstudiante(){
        grupo.imprimirPromedioCadaEstudiante();
    }
}
