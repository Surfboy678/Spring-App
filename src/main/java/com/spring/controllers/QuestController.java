package com.spring.controllers;

import com.spring.domain.Knight;
import com.spring.services.KnightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class QuestController {

    @Autowired
    KnightService knightService;

    @RequestMapping("/assignQuest")
    public String assignQuest(@RequestParam("knightId") Integer id, Model model){
       Knight knight = knightService.getKnight(id);
        return "assignQuest";
    }
}
