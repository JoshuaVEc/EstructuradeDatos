package CP;
import E.E01_Orden;
import TDAs.SortedTableMap;
import TDAs.Entry;
public class ControladorSismos {
    SortedTableMap<Long,EventoSismico> coleccionEventos = new SortedTableMap<>();

    public void addEvento(EventoSismico eventoSismico){
        coleccionEventos.put(eventoSismico.getTimestamp(), eventoSismico);
    }
    public EventoSismico buscarSismoMAyorA(Long tiempoActual, double magnitudMinima){
        Entry<Long, EventoSismico> eventoEntry= coleccionEventos.ceilingEntry(tiempoActual);
        if(eventoEntry==null){
            return null;
        }
        EventoSismico eventoSismico =eventoEntry.getValue();
        if(eventoSismico.getMagnitud()>=magnitudMinima){
            return eventoSismico;
        }
        return buscarSismoMAyorA(eventoSismico.getTimestamp()+1,magnitudMinima);
    }
}

