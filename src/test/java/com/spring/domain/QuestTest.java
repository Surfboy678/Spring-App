package com.spring.domain;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotNull;

public class QuestTest {

    @Test
    public void settingStartedFlagToFalseShouldSetStartData(){
        //Given
        Quest quest = new Quest(1, "Task test");

        //When
        quest.setStarted(true);

        //Then
        assertNotNull(quest.startDate);
    }
    @Test
    public void questShouldBeCompleted(){
        //Given
        Quest quest = new Quest(1, "Task test");

        //When
        quest.setStarted(true);
        quest.lenghtInSeconds = -60;

        //Then
        assertTrue(quest.isCompleted());

    }
    @Test
    public void questShouldNotBeCompleted(){
        //Given
        Quest quest = new Quest(1, "Task test");

        //When
        quest.setStarted(true);
        quest.lenghtInSeconds = 20000;

        //Then
        assertFalse(quest.isCompleted());
        assertFalse(quest.isCompleted());


    }
}
