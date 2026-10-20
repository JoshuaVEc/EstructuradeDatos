package TDAs;

public class EI04_ControladorBiblioteca {
    private EI04_InventarioModelo modelo;

    public EI04_ControladorBiblioteca() {
        this.modelo = new EI04_InventarioModelo();
    }

    public String registrarNuevoLibro(int isbn, String titulo) {
        EI04_Libro nuevo = new EI04_Libro(isbn, titulo);
        modelo.insertarLibro(nuevo);
        return "OK: Libro registrado correctamente -> " + titulo;
    }

    public String consultarLibro(int isbn) {
        EI04_Libro libroEncontrado = modelo.buscarLibro(isbn);
        if (libroEncontrado != null) {
            return "ENCONTRADO: " + libroEncontrado.toString();
        } else {
            return "ERROR: No se encontró ningún libro con ISBN " + isbn;
        }
    }

    public String obtenerEstadisticas() {
        return "Total de libros en la biblioteca: " + modelo.getTotalLibros();
    }
}