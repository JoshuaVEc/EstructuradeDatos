package CP;

import TDAs.SinglyLinkedList;

import java.util.ArrayList;

public class Practice0102_ControladorBiblioteca {
   /* Clase controladora:
    Metodo para Buscar el libro u crear na solicitud que luego la anade a
    un SinglyLinkedList <Solicitud> donde se almacena en orden de creacion las solicitudes
    Descuenta a la cantidad disponible de libros.
    Si cantidad ttal disponible ==0 se la anade a una SingleLinkedList <Solicitud> rechazadas.

    Metodo que imprime un informe de todas las solicitudes rechazadas al final del dia */

    Practice0102_Libro libro =new Practice0102_Libro();
    SinglyLinkedList<Practice0102_Solicitud> solicitudes = new SinglyLinkedList<>();
    SinglyLinkedList<Practice0102_Solicitud> solicitudes_rechazadas = new SinglyLinkedList<>();
    ArrayList<Practice0102_Libro> libros = new ArrayList<Practice0102_Libro>();

    public void Practice0102_ControladorBiblioteca(){

    }

    public void buscarLibro(){

    }
}
