package jaswoo.checkpoint3;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question
{
    private String[] mOptions;
    private int mAnswer;

    public MultipleChoiceQuestion(String text, String[] options, int answer)
    {
        super(text);
        mAnswer = answer;
    }

    @Override
    public boolean checkAnswer(int userAnswer)
    {
        if (mAnswer == userAnswer)
        {
            return true;
        }
        return false;
    }

    public String[] getOptions()
    {
        return mOptions;
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        System.out.println("Enter answer: ");
        String in = input.nextLine();
        return checkAnswer(in);
    }
}
