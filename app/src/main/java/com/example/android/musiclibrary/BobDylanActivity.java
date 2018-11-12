package com.example.android.musiclibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BobDylanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create music list array
        String [] musicNames = {"Times They Are a Changing", "Blowin' in the Wind", "Mr. Tambourine Man"};
        String [] albumNames = {"Man Alive", "The Freewheelin' Bob Dylan", "Bring it All Back Home"};

        ArrayList<Music> music = new ArrayList<Music>();

        for (int i = 0; i < musicNames.length; i++) {
            music.add(new Music(musicNames[i], albumNames[i]));
        }

        // Create music adapter --- interface between grid view and music objects
        MusicAdapter musicAdapter = new MusicAdapter(this, music);

        // Get music list
        ListView musicListView = findViewById(R.id.music_list_view);

        // Link list and adapter
        musicListView.setAdapter(musicAdapter);
    }
}
