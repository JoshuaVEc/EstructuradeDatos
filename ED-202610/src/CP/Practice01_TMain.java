package CP;

import java.util.ArrayList;
import java.util.Arrays;
public class Practice01_TMain {

    static void main(String[] args) {
        ArrayList<Integer> notas1 = new ArrayList<>(Arrays.asList(10,9,8,7,6));
        ArrayList<Integer> notas2 = new ArrayList<>(Arrays.asList(9,9,6,7,9));
        ArrayList<Integer> notas3 =new ArrayList<>(Arrays.asList(9,6,5,7,3));
        Practice01_TController controlador = new Practice01_TController();
        Practice01_TEstud estudiante1= new Practice01_TEstud("Gabriel", 5 , notas1 );
        Practice01_TEstud estudiante2 = new Practice01_TEstud("Juan",17,notas2);
        Practice01_TEstud estudiante3= new Practice01_TEstud("Jose", 20, notas3);

        controlador.anadirEstudiantes(estudiante1);
        controlador.anadirEstudiantes(estudiante2);
        controlador.anadirEstudiantes(estudiante3);

        controlador.imprimirPromedioEstudiante();
        System.out.println("El mejor alumno es: " + controlador.obtenerMejorAlumno());
    }
}
