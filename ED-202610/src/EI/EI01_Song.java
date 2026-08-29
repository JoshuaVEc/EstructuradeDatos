package EI;

public class EI01_Song {
    private String SongName;
    private String Artist;
    private String Genre;

    public EI01_Song(String SongName, String Artist, String Genre) {
        this.SongName = SongName;
        this.Artist = Artist;
        this.Genre = Genre;
    }

    public String getSongName() { return SongName; }
    public void setSongName(String SongName) { this.SongName = SongName; }

    public String getArtist() { return Artist; }
    public void setArtist(String Artist) { this.Artist = Artist; }

    public String getGenre() { return Genre; }
    public void setGenre(String Genre) { this.Genre = Genre; }
}