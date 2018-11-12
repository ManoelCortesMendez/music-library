package com.example.android.musiclibrary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter {

    // Constructor
    public MusicAdapter(Activity context, ArrayList<Music> music) {

        // Create music adaptor object --- by passing a context (current activity)
        // And objects (music)
        super(context, 0, music);
    }

    // Define how the adaptor should process artist objects into views before passing them
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get a recycled view --- that is, a view in the scrap pile because no longer visible on screen
        View listItemView = convertView;

        // If no recycled view is available, create one
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.music_list_item, parent, false);
        }

        // Get index of music in music array list
        Music currentMusic = (Music) getItem(position);

        // Get music name text view of list item view, and set its content to the music's name
        TextView musicNameTextView = listItemView.findViewById(R.id.music_name_text_view);
        musicNameTextView.setText(currentMusic.getMusic());

        // Get album name text view of list item view, and set its content to the album's name
        TextView albumNameTextView = listItemView.findViewById(R.id.album_name_text_view);
        albumNameTextView.setText(currentMusic.getAlbum());

        // Return the music list item view
        return listItemView;
    }
}
