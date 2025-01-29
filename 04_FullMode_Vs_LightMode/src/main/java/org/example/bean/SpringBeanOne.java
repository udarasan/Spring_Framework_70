package org.example.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    @Bean
    public SpringBeanTwo springBeanTwo() {
        SpringBeanThree springBeanThree1 = springBeanThree();
        SpringBeanThree springBeanThree2 =springBeanThree();
        System.out.println(springBeanThree1);
        System.out.println(springBeanThree2);
        return new SpringBeanTwo();
    }
    @Bean
    public SpringBeanThree springBeanThree() {
        return new SpringBeanThree();
    }

}
