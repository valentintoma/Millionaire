package ro.jademy.milionaire;

import java.util.Objects;

public class Answer {

    String answere;
    boolean isCorrect;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answer)) return false;
        Answer answer = (Answer) o;
        return isCorrect == answer.isCorrect &&
                Objects.equals ( answere, answer.answere );
    }

    @Override
    public int hashCode() {

        return Objects.hash ( answere, isCorrect );
    }
}
