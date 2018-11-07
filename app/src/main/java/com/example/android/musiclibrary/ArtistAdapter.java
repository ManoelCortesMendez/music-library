package com.example.android.musiclibrary;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter {
    public ArtistAdapter(Activity context, ArrayList<Artist> artists) {
        super(context, 0, artists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.artist_grid_item, parent, false);
        }

        Artist currentArtist = (Artist) getItem(position);

        TextView artistNameTextView = (TextView) gridItemView.findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText(currentArtist.getName());

        return gridItemView;
    }
}
