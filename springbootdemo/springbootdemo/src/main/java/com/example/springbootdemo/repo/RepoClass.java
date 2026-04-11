package com.example.springbootdemo.repo;

import com.example.springbootdemo.model.Computer;
import org.springframework.stereotype.Repository;

@Repository
public class RepoClass {
    public void saveAlien(Computer comp){
        System.out.println("aliens are saved");
    }
}
