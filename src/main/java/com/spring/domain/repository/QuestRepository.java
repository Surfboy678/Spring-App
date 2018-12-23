package com.spring.domain.repository;

import com.spring.domain.Quest;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestRepository {

    List<Quest> questList = new ArrayList<>();

    public void createQuest(String description){
        questList.add(new Quest(description));
    }
    public List<Quest> getAll(){
        return questList;
    }
    @PostConstruct
    public void init(){
        createQuest("Save princes");
        createQuest("go to the tournament");
    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }
}

