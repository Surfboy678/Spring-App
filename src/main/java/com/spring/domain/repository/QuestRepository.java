package com.spring.domain.repository;

import com.spring.domain.Quest;
import javax.persistence.PersistenceContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.*;

@Repository
public class QuestRepository {


    @PersistenceContext
    private EntityManager em;

    Random rand = new Random();

    @Transactional
    public void createQuest(String description) {

        Quest newQuest = new Quest(description);

        em.persist(newQuest);

    }

    public List<Quest> getAll() {

        return em.createQuery("from Quest", Quest.class).getResultList();
    }

    @Transactional
    public void deleteQuest(Quest quest) {
        em.remove(quest);
    }

    @Scheduled(fixedDelayString  = "${questCreationDelay}")
    @Transactional
    public void createRandomQuest() {
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Save the Princes");
        descriptions.add("Go to the tournament");
        descriptions.add("Kill a bunch of goblins");
        descriptions.add("kill the dragon");

        String description = descriptions.get(rand.nextInt(descriptions.size()));
        createQuest(description);
    }

    @Transactional
    public void update(Quest quest) {
        em.merge(quest);
    }

    public Quest getQuest(Integer id) {
        return em.find(Quest.class, id);
    }
}


