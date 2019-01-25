package com.spring.config;

import com.spring.domain.repository.DBKnightRepository;
import com.spring.domain.repository.InMemoryRepository;
import com.spring.domain.repository.KnightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class MainConfig {

    @Bean("inMemoryKnightRepository")
    @Profile("dev")
    public KnightRepository createInMemoryRepo() {
        KnightRepository repo = new InMemoryRepository();
        return repo;

    }

    @Bean("DBKnightRepository")
    @Profile("prod")
    public KnightRepository createDBRepo() {
        KnightRepository repo = new DBKnightRepository();
        return repo;


    }

}