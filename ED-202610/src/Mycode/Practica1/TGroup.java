package Mycode.Practica1;

import TDAs.SinglyLinkedList;

public class TGroup {
    SinglyLinkedList<TEstud> grupo_estudiantes;

    public void imprimirPromedioEstudiantes(){
            int suma=0;
            int contadorEstudiantes=0;
            TEstud actual=  grupo_estudiantes.first();
            while (actual != null){

                suma+=actual.getNotas().get(0) +
                        actual.getNotas().get(1)+
                        actual.getNotas().get(2)+
                        actual.getNotas().get(3)+
                        actual.getNotas().get(4)+
                        actual.getNotas().get(5);

                contadorEstudiantes++;
                grupo_estudiantes.removeFirst();
        }

    }

    }

