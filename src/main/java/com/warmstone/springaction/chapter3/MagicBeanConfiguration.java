package com.warmstone.springaction.chapter3;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

@Configuration
@ComponentScan(basePackages = {"com.warmstone.springaction.chapter3"})
@PropertySource(value = "classpath:chapter3/magicBean.properties")
public class MagicBeanConfiguration {

    @Bean
    @Conditional(MagicBeanCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocation(new ClassPathResource("chapter3/blankDisc.properties"));
        return configurer;
    }
}
