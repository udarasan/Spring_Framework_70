package org.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
@PropertySource("classpath:application.properties")
public class AppConfig {

}
