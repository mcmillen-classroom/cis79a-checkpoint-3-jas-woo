package jaswoo.checkpoint3;

import java.util.Scanner;

//DRIVER CLASS
//ENTRYPOINT
//MAIN CLASS
public class QuizOOPMain
{
    //ENTRY POINT OF APPLICATION
    //where the app starts
    public static void main(String[] args)
    {

        String[] q4Options = {"Spring", "Summer", "Winter", "Fall"};
        String[] q5Options = {"January", "September", "August"};

        Question[] questions = new Question[5];
        //QUESTION CLASS CREATES A VARIABLE
        //"NEW" OPERATOR CREATES THE SPACE/ADDRESS FOR VARIABLE
        questions[0] = new TrueFalseQuestion("LANEY IS BEST COLLEGE EVER!", true);
        questions[1] = new TrueFalseQuestion("LEARNING IS FUN!", true);
        questions[2] = new FillTheBlankQuestion("Which season will the F Building be open?", "fall");
        questions[3] = new MultipleChoiceQuestion("What season does the school year start in?", q4Options, 3);
        questions[4] = new MultipleChoiceQuestion("What's the first month of the fall semester?", q5Options, 2);


        int index = 0;
        int score = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("welcome to the quiz! Good luck!");

        while (index < questions.length)
        {
            // 2 < 2 IS FALSE
            System.out.println(questions[index].getText());


            if (questions[index].readInputAndCheckAnswer(input))
            {
                System.out.println("You are correct!");
            } else
            {
                System.out.println("You are incorrect!");
            }

            index++;
        }

//            questions[index].getTFAnswer()


    }

}