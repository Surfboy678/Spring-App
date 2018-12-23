package com.spring.domain.repository;

import com.spring.domain.Quest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class QuestRepository {

    Random random = new Random();

    List<Quest> questList = new ArrayList<>();

    public void createQuest(String description){
        questList.add(new Quest(description));
    }
    public List<Quest> getAll(){
        return questList;
    }

    public void deleteQuest(Quest quest){
        questList.remove(quest);
    }

    @PostConstruct
    public void init(){

    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }
    @Scheduled(fixedDelayString = "${questCreationDelay}")
    public void createRandomQuest(){
        List<String> description = new ArrayList<>();
        description.add("Save the Princes");
        description.add("Go to the tournament");
        description.add("Kill a bunch of goblins");
        description.add("kill the dragon");

        String descriptions = description.get(random.nextInt(description.size()));
        System.out.println("do the mission:" + " " +  descriptions);
        createQuest(descriptions);


    }
}

