package org.example.config;

import org.example.bean.SpringBeanOne;
import org.example.bean.SpringBeanThree;
import org.example.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {
    //Inter bean dependency
   /*@Bean
    public SpringBeanTwo springBeanTwo() {
       SpringBeanThree springBeanThree1 = springBeanThree();
       SpringBeanThree springBeanThree2 = springBeanThree();
       return new SpringBeanTwo();
   }
   @Bean
    public SpringBeanThree springBeanThree() {
       return new SpringBeanThree();
   }*/
}
