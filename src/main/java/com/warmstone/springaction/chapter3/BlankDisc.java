package com.warmstone.springaction.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author pengshun
 * @date 2022-09-13 21:42
 * @description
 */
@Component
public class BlankDisc {

    private String title;

    private String artist;

    public BlankDisc(@Value("${disc.title}") String title,
                     @Value("${disc.artist}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "BlankDisc{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
