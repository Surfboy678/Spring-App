package com.spring;

import com.spring.domain.PlayerInformation;
import com.spring.domain.repository.InMemoryRepository;
import com.spring.domain.repository.KnightRepository;
import com.spring.domain.repository.PlayerInformationRepository;
import com.spring.domain.repository.QuestRepository;
import com.spring.services.QuestService;
import com.spring.utils.Role;
import com.spring.utils.RoleRepository;
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

    @Autowired
    RoleRepository roleRepository;


    @Override
    @Transactional
    public void run(String... args) throws Exception {



        questRepository.createRandomQuest();
        questRepository.createRandomQuest();

        knightRepository.createKnight("Percival",32);

        PlayerInformation playerInformation1 = new PlayerInformation("user1", "user1");

        playerInformationRepository.createPlayerInformation(playerInformation1);

        PlayerInformation playerInformation2 = new PlayerInformation("user2", "user2");

        playerInformationRepository.createPlayerInformation(playerInformation2);

        Role use1rRoleUSER = new  Role("user1", "USER");
        Role user2RoleUSER = new  Role("user2", "USER");
        Role use2rRoleUSER = new  Role("user2", "ADMIN");

        roleRepository.presistRole(use1rRoleUSER);
        roleRepository.presistRole(use2rRoleUSER);
        roleRepository.presistRole(user2RoleUSER);


        questService.assignRandomQuest("Percival");


    }
}
