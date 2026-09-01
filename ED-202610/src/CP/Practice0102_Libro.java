package CP;

public class Practice0102_Libro
{
     // Clase Libro : titulo, autor, cantidad total ejemplares, cantidad total disponible.
    private String titulo;
    private String autor;
    private int cantidadTotal;
    private int cantidadDisponible;

    public void Practice0102_Libro(String titulo, String autor,int cantidadTotal,int cantidadDisponible){
        this.titulo = titulo;
        this.autor=autor;
        this.cantidadTotal=cantidadTotal;
        this.cantidadDisponible=cantidadDisponible;
    }
    public void Practice0102_Libro(){

    }
    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}
    public int getCantidadTotal() {return cantidadTotal;}
    public int getCantidadDisponible() {return cantidadDisponible;}

}

