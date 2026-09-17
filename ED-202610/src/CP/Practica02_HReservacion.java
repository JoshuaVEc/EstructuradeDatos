package CP;

public class Practica02_HReservacion {
    int codigo;
    String clientName;
    String hotelName;
    int roomNumber;

    public Practica02_HReservacion(int codigo, String clientName, String hotelName,int roomNumber) {
        this.codigo = codigo;
        this.clientName=clientName;
        this.hotelName = hotelName;
        this. roomNumber =roomNumber;
    }

    public Practica02_HReservacion() {
    }

    public int getCodigo() {
        return codigo;
    }

    public String getClientName() {
        return clientName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
