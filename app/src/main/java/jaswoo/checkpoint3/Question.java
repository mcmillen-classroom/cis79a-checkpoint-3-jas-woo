package jaswoo.checkpoint3;

import java.util.Scanner;

public class Question {
    private String mText;

    // 0 = read in boolean, 1 = read in string, 2 = read in number
    private int mAnswerType;

    public Question(String text) {
        mText = text;
    }

    public int getAnswerType() {
        return mAnswerType;
    }

    public boolean checkAnswer(boolean boolResponse) {
        return false;
    }

    public boolean checkAnswer(String userAnswer) {
        return false;
    }

    public boolean checkAnswer(int userAnswer)
    {
        return false;
    }

    //stub
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        return false;
    }


    public String getText()
    {
        return mText;
    }

}

