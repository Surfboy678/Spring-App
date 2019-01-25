package com.spring;

import com.spring.domain.PlayerInformation;
import com.spring.domain.repository.InMemoryRepository;
import com.spring.domain.repository.KnightRepository;
import com.spring.domain.repository.PlayerInformationRepository;
import com.spring.domain.repository.QuestRepository;
import com.spring.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {



    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;

    @Autowired
    PlayerInformationRepository playerInformationRepository;


    @Override
    @Transactional
    public void run(String... args) throws Exception {



        questRepository.createRandomQuest();
        questRepository.createRandomQuest();

        knightRepository.createKnight("Percival",32);

        playerInformationRepository.cretePlayerInformation(new PlayerInformation());

        questService.assignRandomQuest("Percival");


    }
}
