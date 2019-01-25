package com.spring.utils;

import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;

@Repository
public class RoleRepository {

    @PersistenceContext
    EntityManager em;

    public void presistRole(Role role){

        em.persist(role);

    }
}
