package org.example.config;

import org.example.bean.SpringBean;
import org.springframework.context.annotation.*;

@Configuration
@Import({AppConfig1.class, AppConfig2.class})
//root
@ImportResource("classpath:hibernate.xml")
//if not
@ImportResource("file:absolute-path-of-hibernate.xml")
public class AppConfig {

    @Bean
    public SpringBean springBean() {
        return new SpringBean();
    }
}
