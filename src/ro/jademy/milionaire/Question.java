package ro.jademy.milionaire;

import java.util.ArrayList;

public class Question {

    private static final int MAX_LEVEL = 15;
    private ArrayList<Answer> answersList = new ArrayList<> ();
    private String question;
    private int difficultyLevel; //max 15

    public Question(ArrayList<Answer> answersList, String question, int difficultyLevel) {
        this.answersList = answersList;
        this.question = question;
        this.difficultyLevel = difficultyLevel;
    }

    public int getMaxLevel() {
        return MAX_LEVEL;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<Answer> getAnswersList() {
        return answersList;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }


    public Answer getCorrectAnswer() {

        for (Answer answer : answersList) {
            if (answer.isCorrect ()) {
                return answer;

            }
        }
        return null;
    }


    public void showQuestion() {
        //show question

        System.out.println (question);
        for (int i = 0; i < answersList.size (); i++) {
            String prefix = getPrefix ( i );
            System.out.println ( prefix + answersList.get ( i ) );

        }

    }

    public String getPrefix(int i) {
        switch (i) {
            case 0:
                return "A.";
            case 1:
                return "B.";
            case 3:
                return "C.";
            case 4:
                return "D.";
                default:
                    return "A.";
        }

    }

}

