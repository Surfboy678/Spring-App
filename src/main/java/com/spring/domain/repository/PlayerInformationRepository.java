package com.spring.domain.repository;

import com.spring.domain.PlayerInformation;

import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
public class PlayerInformationRepository {


    @PersistenceContext
    EntityManager em;

    @Transactional
    public void createPlayerInformation(PlayerInformation playerInformation) {
        em.persist(playerInformation);

    }

    public PlayerInformation getFirst() {
        return em.createQuery("from PlayerInformation", PlayerInformation.class).getResultList().get(0);
    }
}
