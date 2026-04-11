package com.example.springbootdemo.model;

import org.springframework.stereotype.Component;

@Component
public class Alien implements Computer {
    public void code() {
        System.out.println("alien one Coding...");
    }
}
