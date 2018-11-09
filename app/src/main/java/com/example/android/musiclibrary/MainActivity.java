package com.example.android.musiclibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Create main activity
        super.onCreate(savedInstanceState);

        // Set main activity content --- by inflating if from layout resource
        setContentView(R.layout.activity_main);

        // Create array of artists names
        String [] artistsNames = {"Michael Jackson", "Bob Dylan", "Aretha Franklin", "Elvis Presley"};

        // Create array of artists images ids
        int [] artistsImages = {R.drawable.michael_jackson, R.drawable.bob_dylan, R.drawable.aretha_franklin, R.drawable.elvis_presley};

        // Create list array of artist objects
        ArrayList<Artist> artists = new ArrayList<Artist>();

        // Populate list array of artist objects
        for (int i = 0; i < artistsNames.length; i++) {
            artists.add(new Artist(artistsNames[i], artistsImages[i]));
        }

        // Create artist adapter --- interface between grid view and artist objects
        ArtistAdapter artistAdapter = new ArtistAdapter(this, artists);

        // Get artists grid
        GridView artistsGridView = (GridView) findViewById(R.id.artists_grid_view);

        // Link grid and adapter
        artistsGridView.setAdapter(artistAdapter);
    }
}
