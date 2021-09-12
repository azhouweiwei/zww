package com.example.springboot.test;

import com.example.springboot.StaticMethodGetBean_3;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;

import java.util.List;
import java.util.Map;

@Component
@EnableScheduling
public class B {
    @Autowired
    public Mappertest mappertest;

    private static ApplicationContext applicationContext;
    //@Autowired
   // public A a;
    @Scheduled(cron = "0/5 * * * * ?")
    @SuppressWarnings("unchecked")
    public void aa(){
       // a.aa();
        Object a2 = StaticMethodGetBean_3.getBean(A.class);
        Object a = ContextLoader.getCurrentWebApplicationContext().getBean("A.class");
        A a1 = (A) a;
        a1.aa();
        List<Map<Object, String>> ss = mappertest.ss();
        System.out.println("1");
    }
}
