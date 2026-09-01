package CP;

public class Practice0102_Solicitud {
   /* Entidad de libro, que pide el nombre : quien va a reservar
    , el nombre del libro. y el autor del libro */
    private String nombreReservador;
    private String nombreLibro;
    private String autorLibro;

    public Practice0102_Solicitud(String nombreReservador, String nombreLibro, String autorLibro) {
        this.nombreReservador = nombreReservador;
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
    }
    public Practice0102_Solicitud() {

    }
    public String getNombreReservador() {return nombreReservador;}
    public String getNombreLibro() {return nombreLibro;}
    public String getAutorLibro() {return autorLibro;}



}
