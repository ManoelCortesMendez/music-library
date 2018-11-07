package com.example.android.musiclibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create list of artists
        String [] artistsNames = {"Michael Jackson", "Bob Dylan"};

        ArrayList<Artist> artists = new ArrayList<Artist>();

        for (int i = 0; i < artistsNames.length; i++) {
            artists.add(new Artist(artistsNames[i]));
        }

        ArtistAdapter artistAdapter = new ArtistAdapter(this, artists);
        GridView artistsGridView = (GridView) findViewById(R.id.artists_grid_view);
        artistsGridView.setAdapter(artistAdapter);
    }
}
