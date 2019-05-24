package com.example.android.melloncollie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TrackList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_list);

        //create an array of track names and info for Disc One
        ArrayList<Tracks> discOne = new ArrayList<>();

        discOne.add(new Tracks("Mellon Collie and the Infinite Sadness", "Billy Corgan"));
        discOne.add(new Tracks("Tonight, Tonight", "Billy Corgan"));
        discOne.add(new Tracks("Jellybelly", "Billy Corgan"));
        discOne.add(new Tracks("Zero", "Billy Corgan"));
        discOne.add(new Tracks("Here Is No Why", "Billy Corgan"));
        discOne.add(new Tracks("Bullet with Butterfly Wings", "Billy Corgan"));
        discOne.add(new Tracks("To Forgive", "Billy Corgan"));
        discOne.add(new Tracks("Fuck You (An Ode To No One)", "Billy Corgan"));
        discOne.add(new Tracks("Love", "Billy Corgan"));
        discOne.add(new Tracks("Cupid de Locke", "Billy Corgan"));
        discOne.add(new Tracks("Galapogos", "Billy Corgan"));
        discOne.add(new Tracks("Muzzle", "Billy Corgan"));
        discOne.add(new Tracks("Porcelina of the Vast Oceans", "Billy Corgan"));
        discOne.add(new Tracks("Take Me Down", "James Iha"));
        discOne.add(new Tracks("Where Boys Fear to Tread", "Billy Corgan"));
        discOne.add(new Tracks("Bodies", "Billy Corgan"));
        discOne.add(new Tracks("Thirty-Three", "Billy Corgan"));
        discOne.add(new Tracks("In the Arms of Sleep", "Billy Corgan"));
        discOne.add(new Tracks("1979", "Billy Corgan"));
        discOne.add(new Tracks("Tales of a Scorched Earth", "Billy Corgan"));
        discOne.add(new Tracks("Thru the Eyes of Ruby", "Billy Corgan"));
        discOne.add(new Tracks("Stumbleine", "Billy Corgan"));
        discOne.add(new Tracks("X.Y.U", "Billy Corgan"));
        discOne.add(new Tracks("We Only Come out at Night", "Billy Corgan"));
        discOne.add(new Tracks("Beautiful", "Billy Corgan"));
        discOne.add(new Tracks("Lily (My One and Only)", "Billy Corgan"));
        discOne.add(new Tracks("By Starlight", "Billy Corgan"));
        discOne.add(new Tracks("Farewell and Goodnight", "Billy Corgan/James Iha"));

        //Create a ContentAdapter whose data source is the list of tracks.
        ContentAdapter adapter = new ContentAdapter(this, discOne);

        //This links the ListView object to the activity_track_list.xml
        ListView listView = findViewById(R.id.track_list);

        //Set the custom adapter to the ListView
        listView.setAdapter(adapter);
    }
}
