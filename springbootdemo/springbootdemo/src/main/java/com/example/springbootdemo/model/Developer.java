package com.example.springbootdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Developer {

    @Value("25")
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }
@Autowired
@Qualifier("alien")
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    private Computer comp;

    public void build(){
        comp.code();
    }
}
