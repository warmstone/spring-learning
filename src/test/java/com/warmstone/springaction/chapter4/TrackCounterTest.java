package com.warmstone.springaction.chapter4;

import com.warmstone.springaction.chapter4.soundsystem.CompactDisc;
import com.warmstone.springaction.chapter4.soundsystem.TrackCounter;
import com.warmstone.springaction.chapter4.soundsystem.TrackCounterConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author pengshun
 * @date 2022-09-17 23:34
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private TrackCounter trackCounter;

    @Test
    public void testTrackCounter() {
        compactDisc.playTrack(1);
        compactDisc.playTrack(1);
        compactDisc.playTrack(2);
        compactDisc.playTrack(2);
        compactDisc.playTrack(2);
        compactDisc.playTrack(3);

        Assert.assertEquals(2, trackCounter.getPlayCount(1));
        Assert.assertEquals(3, trackCounter.getPlayCount(2));
        Assert.assertEquals(1, trackCounter.getPlayCount(3));
    }
}
