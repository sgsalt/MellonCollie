package com.example.android.melloncollie;

public class Tracks {

    //This String variable presents the actual track name
    private String mTrackName;

    //This String variable presents additional track info
    private String mTrackInfo;

    //Create the constructor
    public Tracks(String trackName, String trackInfo) {
        mTrackName = trackName;
        mTrackInfo = trackInfo;
    }

    //Set methods for the Word custom class

    //Get the track name
    public String getmTrackName() {
        return mTrackName;
    }

    //Get the track info
    public String getmTrackInfo() {
        return mTrackInfo;
    }


}
