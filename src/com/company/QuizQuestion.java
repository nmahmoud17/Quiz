package com.company;

public class QuizQuestion {

    private String question;
    private String answer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void printDetails() {
        System.out.println(question);
        System.out.println(answer);
    }



}
