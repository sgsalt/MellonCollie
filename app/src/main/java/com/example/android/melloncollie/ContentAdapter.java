package com.example.android.melloncollie;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

//Create a custom adapter class

public class ContentAdapter extends ArrayAdapter<Tracks> {

    public ContentAdapter(Activity context, ArrayList<Tracks> discOne) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, discOne);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the track name object located at this position in the list
        Tracks currentTrack = getItem(position);

        // Find the TextView in the list_item.xml using findByViewId
        TextView trackTextView = listItemView.findViewById(R.id.track_text_view);
        // Get the track name and set it as text on trackTextView
        trackTextView.setText(currentTrack.getmTrackName());

        // Find the TextView in the list_item.xml using findByViewId
        TextView infoTextView = listItemView.findViewById(R.id.info_text_view);
        // Get the track info and set it as text on infoTextView
        infoTextView.setText(currentTrack.getmTrackInfo());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}