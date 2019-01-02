package com.spring.domain;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class KnightTest {

    @Test
    public void testIfQuestMarkedAsStarted(){

        //Given
        Knight knight = new Knight("Percival", 25);
        Quest quest = new Quest("test task");

        //When
        knight.setQuest(quest);

        //Then
        assertTrue(knight.getQuest().isStarted());

    }
}
