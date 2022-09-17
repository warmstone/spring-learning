package com.warmstone.springaction.chapter4;

import com.warmstone.springaction.chapter4.concert.AppConfig;
import com.warmstone.springaction.chapter4.concert.BalletPerformance;
import com.warmstone.springaction.chapter4.concert.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author pengshun
 * @date 2022-09-17 22:30
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AppConfig.class)
@ContextConfiguration(locations = "classpath:chapter4/applicationContext.xml")
public class AudienceTest {

    @Autowired
    private Performance performance;

//    @Autowired
//    private BalletPerformance performance;

    @Test
    public void testAudience() {
        performance.perform();
    }
}
