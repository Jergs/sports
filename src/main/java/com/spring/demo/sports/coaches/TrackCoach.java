package com.spring.demo.sports.coaches;

import com.spring.demo.sports.services.FortuneService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    private void doMyInit() {
        System.out.println("In Track coach init method");
    }

    private void doMyDestroy() {
        System.out.println("In Track coach destroy method");
    }
}
