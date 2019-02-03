package com.company;


import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    public List<String> questions = new ArrayList<>();
    public List<String> answers = new ArrayList<>();
    QuizQuestion qAndA = new QuizQuestion();

    public void addQuestions() {
        questions.add("What inorganic molecule is produced by lightening?");
        questions.add("Who plays the role of Frank Reynolds in the comedy series “It’s Always Sunny In Philadelphia”?");
        questions.add("What are the only two countries in South America that do not border Brazil?");
        questions.add("What fruit is thrown at the annual food fight festival held in Buñol, Spain?");
        questions.add("Q5");
        questions.add("Q6");
        questions.add("Q7");
    }

    public void addAnswer() {
        answers.add("Oxygen");
        answers.add("Danny Devito");
        answers.add("Chile and Ecuador");
        answers.add("Tomato");
        answers.add("A5");
        answers.add("A6");
        answers.add("A7");

    }


}

