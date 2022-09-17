package com.warmstone.springaction.chapter4.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengshun
 * @date 2022-09-17 23:12
 * @description
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.warmstone.springaction.chapter4.soundsystem")
public class TrackCounterConfig {

    @Bean
    public CompactDisc compactDisc() {
        BlankDisc blankDisc = new BlankDisc("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles");
        List<String> tracks = new ArrayList<>();
        tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
        tracks.add("With a Little Help from My Friends");
        tracks.add("Lucy in the Sky with Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");
        blankDisc.setTracks(tracks);
        return blankDisc;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
