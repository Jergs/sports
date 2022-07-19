package com.spring.demo.sports;

import com.spring.demo.sports.coaches.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanScopeDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(BeanScopeDemoApplication.class, args);

        // load spring config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if ref is the same
        boolean result = (theCoach == alphaCoach);
        System.out.println("\n Pointing to the same object " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        context.close();
    }
}
