package com.spring.demo.sports.services.impl;

import com.spring.demo.sports.services.FortuneService;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
