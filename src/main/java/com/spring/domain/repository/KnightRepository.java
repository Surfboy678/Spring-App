package com.spring.domain.repository;

import com.spring.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;

public interface KnightRepository {
    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Knight getKnight(String name);

    void deleteKnight(String name);


    void build();

    void createKnight(Knight knight);
}
