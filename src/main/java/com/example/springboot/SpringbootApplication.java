package com.example.springboot;

import com.example.springboot.test.A;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.example.springboot.test")
@ComponentScan("com.example.springboot.test")
@Configuration
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
        A autoMethodDemoService = StaticMethodGetBean_3.getBean(A.class);
     // autoMethodDemoService.aa();

    }

}
