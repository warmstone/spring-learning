package com.warmstone.springaction.chapter2;

import com.warmstone.springaction.chapter2.soundsystem.CDPlayerConfig;
import com.warmstone.springaction.chapter2.soundsystem.CompactDisc;
import com.warmstone.springaction.chapter2.soundsystem.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = CDPlayerConfig.class)
@ContextConfiguration(locations = "classpath:chapter2/applicationContext.xml")
public class CDPlayerTest {

    @Autowired
    @Qualifier("blankDisc")
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer cdPlayer;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(compactDisc);
    }

    @Test
    public void testPlay() {
        cdPlayer.play();
    }

    @Test
    public void testBlankDisc() {
        compactDisc.play();
    }
}
