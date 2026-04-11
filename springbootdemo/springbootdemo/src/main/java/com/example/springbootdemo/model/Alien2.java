package com.example.springbootdemo.model;

import org.springframework.stereotype.Component;

@Component
public class Alien2 implements Computer{

    @Override
    public void code() {
        System.out.println("alien two coding");
    }
}
