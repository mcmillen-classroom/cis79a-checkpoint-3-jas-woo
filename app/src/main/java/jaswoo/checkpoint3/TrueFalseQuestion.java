package jaswoo.checkpoint3;

import java.util.Scanner;

public class TrueFalseQuestion extends Question
{
    private boolean mTFAnswer;
    private String[] mFillAnswers;

    public TrueFalseQuestion(String text, boolean ans)
    {
        super(text);
        mTFAnswer = ans;
    }

    //checks the user input against the answer
    //returns whether the user answered correctly
    @Override
    public boolean checkAnswer(boolean userAnswer)
    {
        return (mTFAnswer == userAnswer);
    }

    public boolean getTFAnswer()
    {
        return mTFAnswer;
    }

    public void setTFAnswer(boolean TFAnswer)
    {
        mTFAnswer = TFAnswer;
    }

    public String[] getFillAnswers()
    {
        return mFillAnswers;
    }
    @Override
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        System.out.print("Enter t/f: ");
        String in = input.nextLine();
        boolean boolResponse;

        if (in.equals("t") || in.equals("true"))
        {
            boolResponse = true;
        }
        else
        {
            boolResponse = false;
        }
        return checkAnswer(boolResponse);
    }

}
