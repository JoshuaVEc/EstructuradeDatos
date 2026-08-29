package EI;

import TDAs.SinglyLinkedList;

public class EI01_SongController {

    private SinglyLinkedList<EI01_Song> playlist;

    public EI01_SongController() {
        this.playlist = new SinglyLinkedList<>();
    }

    public void addTrendingSong(EI01_Song song){
        playlist.addFirst(song);
    }

    public void addLessTrendingSong(EI01_Song song){
        playlist.addLast(song);
    }


    public EI01_Song playNextSong(){
        return playlist.removeFirst();
    }

    public EI01_Song playLastSong(){
        return playlist.last();
    }


    public boolean hasMoreSongs(){
        return !playlist.isEmpty();
    }
}