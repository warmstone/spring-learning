package com.warmstone.springaction.chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MagicBeanConfiguration {

    @Bean
    @Conditional(MagicBeanCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
