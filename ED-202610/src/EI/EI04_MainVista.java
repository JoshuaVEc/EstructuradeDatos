package TDAs;

public class EI04_MainVista {

    // --- MÉTODOS DE LA VISTA (Solo manipulan la terminal) ---
    public static void imprimirTitulo(String titulo) {
        System.out.println("\n========================================");
        System.out.println("  " + titulo.toUpperCase());
        System.out.println("========================================");
    }

    public static void imprimirRespuesta(String respuesta) {
        System.out.println(" > " + respuesta);
    }

    // --- MÉTODO PRINCIPAL ---
    public static void main(String[] args) {
        EI04_ControladorBiblioteca controlador = new EI04_ControladorBiblioteca();

        imprimirTitulo("Sistema de Biblioteca EI04 (LinkedBinaryTree)");

        // 1. Inserción de libros
        imprimirRespuesta(controlador.registrarNuevoLibro(500, "Cien Años de Soledad"));
        imprimirRespuesta(controlador.registrarNuevoLibro(300, "1984 - George Orwell"));
        imprimirRespuesta(controlador.registrarNuevoLibro(700, "El Señor de los Anillos"));
        imprimirRespuesta(controlador.registrarNuevoLibro(200, "El Principito"));
        imprimirRespuesta(controlador.registrarNuevoLibro(800, "Dune"));

        System.out.println();
        imprimirRespuesta(controlador.obtenerEstadisticas());

        // 2. Búsquedas
        imprimirTitulo("Resultados de Búsqueda");

        imprimirRespuesta(controlador.consultarLibro(300));
        imprimirRespuesta(controlador.consultarLibro(800));
        imprimirRespuesta(controlador.consultarLibro(999));
    }
}