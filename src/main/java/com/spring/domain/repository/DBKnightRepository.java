package com.spring.domain.repository;

import com.spring.domain.Knight;
import org.springframework.stereotype.Repository;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.annotation.PostConstruct;
import java.util.Collection;


public class DBKnightRepository implements KnightRepository {

    @Override
    public void createKnight(String name, int age){
        System.out.println("use database");
        throw new NotImplementedException();
    }

    @Override
    public Collection<Knight> getAllKnights(){
        System.out.println("use database");
        throw new NotImplementedException();
    }

    @Override
    public Knight getKnight(String name){
        System.out.println("use database");
        throw new NotImplementedException();
    }

    @Override
    public void deleteKnight(String name){
        System.out.println("use database");
        throw new NotImplementedException();
    }

    @Override
    @PostConstruct
    public void build(){

    }

    @Override
    public void createKnight(Knight knight) {
        System.out.println("use database");
        throw new NotImplementedException();

    }
}
