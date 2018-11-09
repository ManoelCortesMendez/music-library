package com.example.android.musiclibrary;

public class Artist {
    // Define member variables
    private String mName;
    private int mImageId;

    // Define constructor
    public Artist(String aName, int anImageId) {

        mName = aName;
        mImageId = anImageId;
    }

    // Define methods
    public String getName() { return mName; }
    public int getImageId() { return mImageId; }
}
