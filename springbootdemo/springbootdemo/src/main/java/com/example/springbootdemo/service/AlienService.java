package com.example.springbootdemo.service;

import com.example.springbootdemo.model.Computer;
import com.example.springbootdemo.repo.RepoClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlienService {
    @Autowired
   private RepoClass repoClass;
    public void addAlien(Computer comp) {
        System.out.println("alien"+comp+" added");
        repoClass.saveAlien(comp);
    }

    public boolean isWorkable(Computer comp){
        return true;
    }
}
