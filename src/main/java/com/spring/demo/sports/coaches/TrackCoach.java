package com.spring.demo.sports.coaches;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spent 30 minutes on batting practice";
    }
}
