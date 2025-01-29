package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean{
    //public SpringBean(){}
    @Autowired(required=false)
    public SpringBean(@Value("udara-san") String name,
                      @Value("6") String names) {
        System.out.println("Spring Bean Object Created");
        System.out.println(name);
        System.out.println(names);
    }
    @Autowired(required=false)
    public SpringBean(@Value("udara-san") String name, @Value("3") int id) {
        System.out.println("Spring Bean Object Created");
        System.out.println(name);
        System.out.println(id);
    }

}
