package CP;

public class Practice01_TController {
Practice01_TGroup grupo ;
    public void añadirEstudiantes(Practice01_TEstud estudiante){
        grupo.getEstudiantes().addLast(estudiante);

    }
}
