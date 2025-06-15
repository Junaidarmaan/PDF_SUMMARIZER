package com.junnu.app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.junnu.app.DTO.QuestionAnswerRequestDTO;
import com.junnu.app.DTO.SummaryData;
import com.junnu.app.Services.AI;

@RestController
public class Home {
    @Autowired
    AI ai;

    @PostMapping("/summarize")
    public String getResponse(@RequestBody SummaryData data){
        System.out.println(data.getText());
        return ai.getSummary(data.getText());
    }

    
}
