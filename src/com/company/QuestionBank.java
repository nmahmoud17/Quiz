package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionBank {

    private List<QuizQuestion> questionsArray = new ArrayList<>();

    public void addQuestions(QuizQuestion qQuestions) {
        questionsArray.add(qQuestions);
    }


    public void setQuestion() {
        // Lines 17 and 18 are the same as line 19
//        QuizQuestion newQUestion = new QuizQuestion("hi?", "hello");
//        questionsArray.add(newQUestion);

        questionsArray.add(new QuizQuestion("hello?", "hi"));
        addQuestions( new QuizQuestion("What inorganic molecule is produced by lightening?", "Oxygen"));


    }






}

