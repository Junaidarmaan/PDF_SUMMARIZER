package com.junnu.app.DTO;

public class QuestionAnswerRequestDTO {
    String question;
    String context;
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getContext() {
        return context;
    }
    public void setContext(String context) {
        this.context = context;
    }
}
