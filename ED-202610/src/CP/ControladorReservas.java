package CP;

import TDAs.Entry;
import TDAs.TreeMap;

public class ControladorReservas {

    TreeMap<Integer, Reserva> reservas = new TreeMap<>();

    public void addReserva(int fecha ,Reserva reserva){
        reservas.put(fecha,reserva);
    }
    public Reserva getReserva(int fecha){
        return reservas.get(fecha);
    }
    public Entry<Integer,Reserva> proximaReserva(int fecha){
        return reservas.higherEntry(fecha);
    }
    public Iterable<Entry<Integer,Reserva>> imprimirReporte(int fechaInico , int fechafin){
        return reservas.subMap(fechaInico , fechafin +1);

    }



}
