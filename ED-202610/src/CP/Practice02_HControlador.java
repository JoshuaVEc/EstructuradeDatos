package CP;

import TDAs.DoublyLinkedList;
import TDAs.LinkedQueue;

public class Practice02_HControlador {

    LinkedQueue<Practice02_HSolicitud> listVip = new LinkedQueue<>();
    LinkedQueue<Practice02_HSolicitud> listNormal = new LinkedQueue<>();

    DoublyLinkedList<Practice02_HReservacion> reservations = new DoublyLinkedList<>();
    public void addSolicitud(Practice02_HSolicitud solicitud){
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
            Practice02_HSolicitud solicitudTempo = listVip.dequeue();
            Practice02_HReservacion reservacion = new Practice02_HReservacion(solicitudTempo.getCode(),solicitudTempo.getClientName(),solicitudTempo.gethotelName(), roomNumberCounter++);
            reservations.addLast(reservacion);


        }
        while(!listNormal.isEmpty()){
            Practice02_HSolicitud solicitudTempo = listNormal.dequeue();
            Practice02_HReservacion reservacion = new Practice02_HReservacion(solicitudTempo.getCode(),solicitudTempo.getClientName(),solicitudTempo.gethotelName(), roomNumberCounter++);
            reservations.addLast(reservacion);

        }
    }
    public DoublyLinkedList<Practice02_HReservacion> getReservations(){
        return reservations;
    }


    public Practice02_HSolicitud getSolicitud(Practice02_HSolicitud solicitud) {
        LinkedQueue<Practice02_HSolicitud> targetQueue = new LinkedQueue<>();
        Practice02_HSolicitud search = null;

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

        LinkedQueue<Practice02_HSolicitud> copyQueue= new LinkedQueue<>();
        while(!targetQueue.isEmpty()){
            Practice02_HSolicitud actual = targetQueue.dequeue();
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

    public DoublyLinkedList<Practice02_HReservacion> getThisHotelReservation(String nameHotel) {
        DoublyLinkedList<Practice02_HReservacion> copyReservacion = new DoublyLinkedList<>();
        DoublyLinkedList<Practice02_HReservacion> reservationThisHotel = new DoublyLinkedList<>();
        Practice02_HReservacion reservation = null;
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
