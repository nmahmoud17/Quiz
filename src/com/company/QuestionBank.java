package com.company;


import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    public List<String> questionsArray = new ArrayList<>();
    public List<String> answersArray = new ArrayList<>();

    public void addQuestions(QuizQuestion ques) {
        questionsArray.add("What inorganic molecule is produced by lightening?");
        questionsArray.add("Who plays the role of Frank Reynolds in the comedy series “It’s Always Sunny In Philadelphia”?");
        questionsArray.add("What are the only two countries in South America that do not border Brazil?");
        questionsArray.add("What fruit is thrown at the annual food fight festival held in Buñol, Spain?");
        questionsArray.add("Q5");
        questionsArray.add("Q6");
        questionsArray.add("Q7");
        questionsArray.add(ques);
    }

    public void addAnswer() {
        answersArray.add("Oxygen");
        answersArray.add("Danny Devito");
        answersArray.add("Chile and Ecuador");
        answersArray.add("Tomato");
        answersArray.add("A5");
        answersArray.add("A6");
        answersArray.add("A7");
    }


}

