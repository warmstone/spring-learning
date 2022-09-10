package com.warmstone.springaction.chapter2.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
//@ComponentScan(basePackages = "com.warmstone.springaction.chapter2.soundsystem")
public class CDPlayerConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer mediaPlayer() {
        return new CDPlayer(compactDisc());
    }
}
