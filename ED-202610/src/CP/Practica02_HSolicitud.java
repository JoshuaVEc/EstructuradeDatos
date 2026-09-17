package CP;

public class Practica02_HSolicitud {
    int code;
    String clientName;
    String hotelName;
    String clientType;
    String timeOfStay;

    public Practica02_HSolicitud(int code,String hotelName,String clientType, String timeOfStay) {
        this.code = code;
        this.hotelName =hotelName;
        this.clientType=clientType;
        this.timeOfStay = timeOfStay;
    }

    public Practica02_HSolicitud() {
    }

    public int getCode() {
        return code;
    }


    public String getClientName() {
        return clientName;
    }


    public String gethotelName() {
        return hotelName;
    }


    public String getClientType() {
        return clientType;
    }


    public String getTimeOfStay() {
        return timeOfStay;
    }


}
