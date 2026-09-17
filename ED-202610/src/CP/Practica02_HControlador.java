package CP;

import TDAs.DoublyLinkedList;
import TDAs.LinkedQueue;

public class Practica02_HControlador {

    LinkedQueue<Practica02_HSolicitud> listVip = new LinkedQueue<>();
    LinkedQueue<Practica02_HSolicitud> listNormal = new LinkedQueue<>();

    DoublyLinkedList<Practica02_HReservacion> reservations = new DoublyLinkedList<>();
    public void addSolicitud(Practica02_HSolicitud solicitud){
        if(solicitud == null || solicitud.getClientType() ==null){
            return;
        }
        if(solicitud.getClientType().equalsIgnoreCase("VIP")){
            listVip.enqueue(solicitud);
        } else if (solicitud.getClientType().equalsIgnoreCase("Normal")){
            listNormal.enqueue((solicitud));
        }
    }


    public void makeReservations(){
        int roomNumberCounter = 100;
        while(!listVip.isEmpty()){
            Practica02_HSolicitud solicitudTempo = listVip.dequeue();
            Practica02_HReservacion reservacion = new Practica02_HReservacion(solicitudTempo.getCode(),solicitudTempo.getClientName(),solicitudTempo.gethotelName(), roomNumberCounter++);
            reservations.addLast(reservacion);


        }
        while(!listNormal.isEmpty()){
            Practica02_HSolicitud solicitudTempo = listNormal.dequeue();
            Practica02_HReservacion reservacion = new Practica02_HReservacion(solicitudTempo.getCode(),solicitudTempo.getClientName(),solicitudTempo.gethotelName(), roomNumberCounter++);
            reservations.addLast(reservacion);

        }
    }
    public DoublyLinkedList<Practica02_HReservacion> getReservations(){
        return reservations;
    }


    public Practica02_HSolicitud getSolicitud(Practica02_HSolicitud solicitud) {
        LinkedQueue<Practica02_HSolicitud> targetQueue = new LinkedQueue<>();
        Practica02_HSolicitud search = null;

        if(solicitud == null || solicitud.getClientType() == null){
            return null;
        }

        if(solicitud.getClientType().equalsIgnoreCase("VIP")){
            targetQueue = listVip;
        } else if (solicitud.getClientType().equalsIgnoreCase("Normal")){
            targetQueue = listNormal;
        } else {
            return null;
        }

        LinkedQueue<Practica02_HSolicitud> copyQueue= new LinkedQueue<>();
        while(!targetQueue.isEmpty()){
            Practica02_HSolicitud actual = targetQueue.dequeue();
            if(actual.getCode()==solicitud.getCode()){
                search= actual;

            }
            copyQueue.enqueue(actual);

        }
        while(!copyQueue.isEmpty()){
            targetQueue.enqueue(copyQueue.dequeue());
        }
    return search;
    }

    public DoublyLinkedList<Practica02_HReservacion> getThisHotelReservation(String nameHotel) {
        DoublyLinkedList<Practica02_HReservacion> copyReservacion = new DoublyLinkedList<>();
        DoublyLinkedList<Practica02_HReservacion> reservationThisHotel = new DoublyLinkedList<>();
        Practica02_HReservacion reservation = null;
        while(!reservations.isEmpty()){
                reservation = reservations.removeFirst();
                if(reservation.getHotelName().equalsIgnoreCase(nameHotel)){
                    reservationThisHotel.addLast(reservation);
                }
                copyReservacion.addLast(reservation);
        }
        while(!copyReservacion.isEmpty()){
            reservations.addLast(copyReservacion.removeFirst());
        }
        return reservationThisHotel;

    }
}
