package E;

import TDAs.DoublyLinkedList;
import TDAs.LinkedQueue;
import TDAs.LinkedStack;

import java.util.LinkedList;

public class E01_Controlador {
    LinkedQueue<E01_Persona> personas = new LinkedQueue<>();
    LinkedStack<E01_Orden> ofertas = new LinkedStack<>();
    double valorActualSubasta=0;
    int counter =1000;

    public boolean addParticipantes(E01_Persona persona)
    {
        if (persona.getCapital() > 0){
            personas.enqueue(persona);
            return true;
        }else{
            return false;
        }

    }
    public E01_Persona getFirstParticipan(){
        return personas.first();
    }
    public void nextParticipante(){
        personas.dequeue();
    }

    public boolean hacerOferta(double Oferta){

        if(valorActualSubasta>= Oferta || Oferta <10){
            return false;
        }else {
            E01_Persona persona = getFirstParticipan();
            if(Oferta>persona.getCapital()){
                personas.dequeue();
                return false;
            } else{
                valorActualSubasta=Oferta;
                double capital = persona.getCapital();
                double nuevoCapital = capital-Oferta;
                persona.setCapital(nuevoCapital);
                personas.dequeue();
                if(nuevoCapital > 0){
                    personas.enqueue(persona);
                }

                E01_Orden orden = new E01_Orden(Oferta,persona,counter++);
                ofertas.push(orden);
                return true;
            }
        }



}
public void SimularSubastas(){
        int counter =10;
        while(!personas.isEmpty()){

            hacerOferta(counter);
            counter=counter+10;
        }
}
public E01_Orden ganador(){
        if(ofertas.isEmpty()){
            return null;
        }
        return ofertas.top();
}
public LinkedStack<E01_Orden> getOfertas(){
        return ofertas;
}

}
