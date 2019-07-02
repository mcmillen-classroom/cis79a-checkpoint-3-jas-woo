package jaswoo.checkpoint3;

import java.util.Scanner;

public class FillTheBlankQuestion extends Question
{

    private String[] mFillAnswers;

    public FillTheBlankQuestion(String text, String... ans)
    {
        super(text);
        mFillAnswers = ans;
    }

    //stub method - intentionally does nothing
    //applies only to FTB QUestions
    //fill the blank override
    @Override
    public boolean checkAnswer(String userAnswer) {
        boolean foundAnswer = false;

        for (String ans : getFillAnswers()) {
            if (ans.equalsIgnoreCase(userAnswer)) {
                return true;
            }
        }
        return false;

    }

    public String[] getFillAnswers() {
        return mFillAnswers;
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        System.out.print("Enter answer: ");
        String in = input.nextLine();
        return checkAnswer(in);

    }
}
