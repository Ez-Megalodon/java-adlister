package models;

import java.io.Serializable;

public class Album implements Serializable {

    private long id;
    private String artist;
    private String albumName;
    private String genre;

    public Album(){

    }

    public Album(long id, String artist, String albumName, String genre) {
        this.id = id;
        this.artist = artist;
        this.albumName = albumName;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
