package com.spring.domain.repository;



import com.spring.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryRepository implements KnightRepository {



    Map<Integer, Knight> knights = new HashMap<>();

    public InMemoryRepository(){

    }


    @Override
    public void createKnight(String name, int age){
        Knight newKnight = new Knight(name, age);
        newKnight.setId(getNewId());
        knights.put(newKnight.getId(), newKnight);
    }

    public int getNewId() {
        if (knights.isEmpty()) {
            return 0;
        }else {
            Integer integer = knights.keySet().stream().max(Integer::max).get();
            return integer+1;
        }
    }

    @Override
    public Collection<Knight> getAllKnights(){
        return knights.values();
    }

    @Override
    public Optional<Knight> getKnight(String name){

        Optional<Knight> knightByName = knights.values().stream().filter(knight -> knight.getName().equals(name)).findAny();
        return knightByName;
    }

    @Override
    public void deleteKnight(Integer id){
        knights.remove(id);
    }

    @Override
    @PostConstruct
    public void build(){
        createKnight("Lancelot", 29);
        createKnight("Percival", 25);
    }

    @Override
    public void createKnight(Knight knight) {
        knights.put(knight.getName().hashCode(), knight);
    }

    @Override
    public Knight getKnightById(Integer id) {
        return knights.get(id);
    }

    @Override
    public String toString() {
        return "KnightRepository{" +
                "knights=" + knights +
                '}';
    }
}
