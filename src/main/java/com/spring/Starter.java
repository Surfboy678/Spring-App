package com.spring;

import com.spring.domain.repository.KnightRepository;
import com.spring.domain.repository.QuestRepository;
import com.spring.services.QuestService;
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

    @Autowired
    QuestService questService;


    @Override
    public void run(String... args) throws Exception {



        questRepository.createRandomQuest();
        System.out.println(questRepository);
        questRepository.createRandomQuest();
        System.out.println(questRepository);
        questRepository.createRandomQuest();
        System.out.println(questRepository);

        questService.assignRandomQuest("Lancelot");
        questService.assignRandomQuest("Percival");




    }
}
