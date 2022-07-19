package com.spring.demo.sports;

import com.spring.demo.sports.coaches.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanLifecycleApplication {

    public static void main(String[] args) {

        SpringApplication.run(BeanLifecycleApplication.class, args);

        // load spring config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
