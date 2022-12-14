package com.warmstone.springaction.chapter3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicBeanConfiguration.class)
public class MagicBeanTest {

    @Autowired
    private MagicBean magicBean;

    @Autowired
    private BlankDisc blankDisc;

    @Test
    public void testMagicBeanExists() {
        Assert.assertNotNull(magicBean);
    }

    @Test
    public void testBlankDisc() {
        System.out.println(blankDisc);
    }
}
