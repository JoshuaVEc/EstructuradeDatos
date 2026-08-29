package EI;

import java.util.Scanner;

public class EI01_Musicapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EI01_SongController controller = new EI01_SongController();


        controller.addLessTrendingSong(new EI01_Song("Bohemian Rhapsody", "Queen", "Rock"));
        controller.addLessTrendingSong(new EI01_Song("Blinding Lights", "The Weeknd", "Pop"));
        controller.addLessTrendingSong(new EI01_Song("Shape of You", "Ed Sheeran", "Pop"));
        controller.addLessTrendingSong(new EI01_Song("Hotel California", "Eagles", "Rock"));

        System.out.println("---------------------");
        System.out.println("Reproductor Musical");
        System.out.println("Estas en tu playlist favorita\n");


        if (controller.hasMoreSongs()) {
            imprimirCancion(controller.playNextSong());
        }

        boolean encendido = true;


        while (encendido && controller.hasMoreSongs()) {
            System.out.println("\nComandos: [next] Siguiente | [last] Escuchar la ultima | [salir] Apagar");
            System.out.print("> ");
            String accion = scanner.nextLine().toLowerCase().trim();

            switch (accion) {
                case "next":
                    imprimirCancion(controller.playNextSong());
                    break;
                case "last":
                    imprimirCancion(controller.playLastSong());
                    break;
                case "salir":
                    encendido = false;
                    System.out.println("Apagando reproductor...");
                    break;
                default:
                    System.out.println("Comando inválido. Intenta de nuevo.");
            }
        }

        if (!controller.hasMoreSongs() && encendido) {
            System.out.println("\n¡Se acabó la playlist! No hay más canciones.");
        }

        scanner.close();
    }


    private static void imprimirCancion(EI01_Song cancion) {
        if (cancion != null) {
            System.out.println("🔊 Escuchando: " + cancion.getSongName() +
                    " por " + cancion.getArtist() +
                    " [" + cancion.getGenre() + "]");
        }
    }
}