package com.example.android.musiclibrary;

public class Music {

    // Define member variables
    private String mMusic;
    private String mAlbum;

    // Define constructor
    public Music(String aMusic, String anAlbum) {
        mMusic = aMusic;
        mAlbum = anAlbum;
    }

    // Define methods
    public String getMusic() { return mMusic; }
    public String getAlbum() { return mAlbum; }
}
