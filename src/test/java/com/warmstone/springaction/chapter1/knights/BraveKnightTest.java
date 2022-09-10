package com.warmstone.springaction.chapter1.knights;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.mockito.Mockito.*;


//@RunWith(SpringJUnit4ClassRunner.class)
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest quest = mock(Quest.class);
        Knight knight = new BraveKnight(quest);
        knight.embarkOnQuest();
        verify(quest, times(1)).embark();
    }

    @Test
    public void testSpringXMLKnight() {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter1/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }

    @Test
    public void testSpringConfigKnight() {
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }

    @Test
    public void testMinstrel() {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter1/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
