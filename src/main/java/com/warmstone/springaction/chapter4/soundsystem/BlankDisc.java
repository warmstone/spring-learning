package com.warmstone.springaction.chapter4.soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;

    private String artist;

    private List<String>  tracks;

    public BlankDisc(String title, String artist) {
        this.artist = artist;
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("BlankDisc Playing " + title + " by " + artist);
    }

    public void playTrack(int trackNumber) {

    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
