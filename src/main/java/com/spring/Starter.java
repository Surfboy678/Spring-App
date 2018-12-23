package com.spring;

import com.spring.domain.repository.KnightRepository;
import com.spring.domain.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {



    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;


    @Override
    public void run(String... args) throws Exception {

        System.out.println(knightRepository);
        System.out.println(questRepository);




    }
}
