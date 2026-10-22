package CP;

public class Reserva {
    Huesped huesped = new Huesped();

    public void setHuesped(String huesped){
        this.huesped.setNombre(huesped);
    }
    public String getHuesped(){
        return huesped.getNombre();
    }
}
