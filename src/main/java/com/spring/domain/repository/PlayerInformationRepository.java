package com.spring.domain.repository;

import com.spring.domain.PlayerInformation;
import com.spring.domain.Quest;
import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
public class PlayerInformationRepository {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public void cretePlayerInformation(PlayerInformation playerInformation) {

        PlayerInformation pi  = new PlayerInformation();

        em.persist(pi);
    }

    public PlayerInformation getFirst() {
        return em.createQuery("from PlayerInformation", PlayerInformation.class).getResultList().get(0);
    }
}
