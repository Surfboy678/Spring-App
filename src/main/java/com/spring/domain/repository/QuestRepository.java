package com.spring.domain.repository;

import com.spring.domain.Quest;
import com.spring.utils.Ids;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class QuestRepository {


    Random random = new Random();

    Map<Integer,Quest> quests = new HashMap<>();


    public void createQuest(String description) {
        int newId = Ids.generateNewId(quests.keySet());
        Quest newQuest = new Quest(newId, description);
        quests.put(newId, newQuest);
    }

    public List<Quest> getAll() {
        return  new ArrayList<>(quests.values());
    }

    public void deleteQuest(Quest quest) {
        quests.remove(quest.getId());
    }

    @PostConstruct
    public void init() {



    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + quests +
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
        createQuest(descriptions);


    }
    public void update(Quest quest) {
        quests.put(quest.getId(),quest);
    }

    public Quest getQuest(Integer id) {
        return quests.get(id);
    }
}


