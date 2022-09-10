package com.warmstone.springaction.chapter2.soundsystem;

public class BlankDisc implements CompactDisc{

    private String title;

    private String artist;

    public BlankDisc(String title, String artist) {
        this.artist = artist;
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("BlankDisc Playing " + title + " by " + artist);
    }
}
