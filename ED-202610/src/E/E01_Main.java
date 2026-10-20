package E;

import TDAs.LinkedQueue;
import TDAs.LinkedStack;

public class E01_Main {

    public static void main(String[] args) {

        E01_Controlador controlador = new E01_Controlador();
        E01_Persona persona1 = new E01_Persona(200, "Juan");
        E01_Persona persona2 = new E01_Persona(150, "Mario");
        E01_Persona persona3 = new E01_Persona(160, "Pedro");
        E01_Persona persona4 = new E01_Persona(2000, "Jose");
        controlador.addParticipantes(persona1);
        controlador.addParticipantes(persona2);
        controlador.addParticipantes(persona3);
        controlador.addParticipantes(persona4);
        controlador.SimularSubastas();

        E01_Orden ganador = controlador.ganador();

        System.out.println("La Oferta Ganadora fue: " + ganador.getValorOferta() + " Nombre: "+ ganador.getPersona().getNombre());

        LinkedStack<E01_Orden> ofertas = controlador.getOfertas();

        while(!ofertas.isEmpty()){
            E01_Orden orden = ofertas.pop();

            System.out.println("Oferta: Valor: " + orden.getValorOferta() + " Nombre: " + orden.getPersona().getNombre());
        }


    }
}
