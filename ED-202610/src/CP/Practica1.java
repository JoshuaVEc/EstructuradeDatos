package CP;

import TDAs.Entry;

public class Practica1 {
    static public void main(String[] args){

        Reserva r1 =new Reserva();
        r1.setHuesped("Juan");
        Reserva r2= new Reserva();
        Reserva r3= new Reserva();
        Reserva r4 =new Reserva();
        r2.setHuesped("Mario");
        r3.setHuesped("julian");
        r4.setHuesped("Emanuela");

        ControladorReservas controladorReservas = new ControladorReservas();
        controladorReservas.addReserva(20261021, r1);
        controladorReservas.addReserva(20261020, r2);
        controladorReservas.addReserva(20261022,r3);
        controladorReservas.addReserva(20261019,r4);

        Reserva reservaProxima = controladorReservas.proximaReserva(20261020).getValue();
        System.out.println("La reserva mas proxima a " + 20261020 +" es la de "+ reservaProxima.getHuesped());
        Iterable<Entry<Integer,Reserva>> reporte = controladorReservas.imprimirReporte(20261019,20261022);

        for (Entry<Integer,Reserva> entrada : reporte){
            System.out.println("ID : " +entrada.getKey() + " Nombre : " + entrada.getValue().getHuesped());

        }
    }
}
