package com.spring.domain.repository;

import com.spring.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Optional;

public interface KnightRepository {
    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

     Optional<Knight> getKnight(String name);

    void deleteKnight(Integer id);


    void build();

    void createKnight(Knight knight);

    Knight getKnightById(Integer id);
}
