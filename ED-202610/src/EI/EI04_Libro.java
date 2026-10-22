package EI;

public class EI04_Libro {
    private int isbn;
    private String titulo;

    public EI04_Libro(int isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
    }

    public int getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }

    @Override
    public String toString() {
        return "ISBN: " + isbn + " | Título: '" + titulo + "'";
    }
}