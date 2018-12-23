package com.spring.domain.repository;



import com.spring.domain.Knight;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class KnightRepository {


    private String name;
    Map<String, Knight> knights = new HashMap<>();

    public KnightRepository(){

    }

    KnightRepository(String name){
        this.name = name;
    }

    public void createKnight(String name, int age){
        knights.put(name, new Knight(name, age));
    }

    public Collection<Knight> getAllKnights(){
        return knights.values();
    }

    public Knight getKnight(){
        return knights.get(name);
    }

    public void deleteKnight(String name){
        knights.remove(name);
    }

    @PostConstruct
    public void build(){
        createKnight("Lancelot", 29);
        createKnight("Pecival", 25);
    }


    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "KnightRepository{" +
                "knights=" + knights +
                '}';
    }
}
