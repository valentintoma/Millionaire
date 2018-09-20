package ro.jademy.milionaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Millionaire {
    public List<Question> allQuestions = new ArrayList<> ();

    public  void main(String[] args) {

        initQuestions ();
        List<Question> gameQuestionList =getGameQustionList();


        Game game1 = new Game ( gameQuestionList );



    }

    public    ArrayList<Question> getGameQuestions(){
        Random rand = new Random (  );

        Question randomElem  = (allQuestions.get(rand.nextInt(allQuestions.size())));


    }
    private static void initQuestions() {
        ArrayList<Answer> answers = new ArrayList<> ();
        answers.add ( new Answer ( "1987" ) );
        answers.add ( new Answer ( "1897" ) );
        answers.add ( new Answer ( "1997" ) );
        answers.add ( new Answer ( "1984", true ) );
        Question question1 = new Question ( answers, "Cand s-a construit casa Poporului ", 1 );


        answers.add ( new Answer ( "Doha", true ) );
        answers.add ( new Answer ( "Abuh Dabi" ) );
        answers.add ( new Answer ( "Barcelona" ) );
        answers.add ( new Answer ( "Riyhad   " ) );

        Question question2 = new Question ( answers, "Care este capitala Quatarului ?", 2 );
        answers.add ( new Answer ( "10 ani", true ) );
        answers.add ( new Answer ( "18 ani" ) );
        answers.add ( new Answer ( "14 ani" ) );
        answers.add ( new Answer ( "8 ani   " ) );
        Question question3 = new Question ( answers, "Cat timp a domnit Mircea Cel Batran", 3 );

    }

}



