package org.example;

import org.example.config.AppConfig;
import org.example.config.AppConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        //context.register(AppConfig1.class);
        context.refresh();

        context.registerShutdownHook();


    }
}
