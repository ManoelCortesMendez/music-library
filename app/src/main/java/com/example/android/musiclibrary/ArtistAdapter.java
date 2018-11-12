package com.example.android.musiclibrary;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter {

    // Constructor
    public ArtistAdapter(Activity context, ArrayList<Artist> artists) {

        // Create artist adaptor object --- by passing a context (current activity)
        // And objects (artists)
        super(context, 0, artists);
    }

    // Define how the adaptor should process artist objects into views before passing them
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get a recycled view --- that is, a view in the scrap pile because no longer visible on screen
        View gridItemView = convertView;

        // If no recycled view is available, create one
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.artist_grid_item, parent, false);
        }

        // Get index of artist in artists array list
        final Artist currentArtist = (Artist) getItem(position);

        // Get name text view of grid item view, and set its content to the artist's name
        ImageView artistImageView = gridItemView.findViewById(R.id.artist_image_view);
        artistImageView.setImageResource(currentArtist.getImageId());

        // Get name text view of grid item view, and set its content to the artist's name
        TextView artistNameTextView = gridItemView.findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText(currentArtist.getName());

        // Attach a click listener to the artist grid item view
        gridItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Dynamically define the activity that should be started on click
                // The try/catch is required for this to work
                Class activityToStart = null;
                try {
                    activityToStart = Class.forName("com.example.android.musiclibrary." + currentArtist.getName().replaceAll(" ", "") + "Activity");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                // Create intent for transition from grid to artist activity on click
                Intent intent = new Intent(getContext(), activityToStart);
                getContext().startActivity(intent);
            }
        });

        // Return the fully-functional artist grid item view
        return gridItemView;
    }
}
