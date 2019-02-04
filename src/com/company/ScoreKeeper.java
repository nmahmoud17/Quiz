package com.company;

public class ScoreKeeper {

    private int scoreKeeper;
    QuizQuestion questions = new QuizQuestion();
    QuestionBank bank = new QuestionBank();


    public int getScoreKeeper() {
        return scoreKeeper;
    }

    public void setScoreKeeper(int scoreKeeper) {
        this.scoreKeeper = scoreKeeper;
    }

    public void scoreTracker(String userAnswer) {
        int counter = 0;
        for (int i=0; i<bank.questionsArray.size(); i++)
        if (questions.getAnswer().equalsIgnoreCase(userAnswer)) {
            counter++;

            System.out.println("You just gained a point! Your score is: " + counter);

        } else {
            counter--;
            System.out.println("Wrong answer! Your score is now: " + counter);
        }

    }

}
