import java.util.Scanner;

public class QuestionService {

  Scanner sc = new Scanner(System.in);
  String selection[] = new String[5];
  Question[] questions = new Question[5];
  public QuestionService()
  {
    questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
    questions[1] = new Question(2, "Which planet is known as the Red Planet?", "Venus", "Mars", "Jupiter", "Saturn", "Mars");
    questions[2] = new Question(3, "Who wrote 'Hamlet'?", "Charles Dickens", "Mark Twain", "William Shakespeare", "Leo Tolstoy", "William Shakespeare");
    questions[3] = new Question(4, "Which element has the chemical symbol 'O'?", "Oxygen", "Gold", "Hydrogen", "Osmium", "Oxygen");
    questions[4] = new Question(5, "In which year did the Titanic sink?", "1910", "1912", "1914", "1920", "1912");

  }
  public void playQuiz(){
    int i=0;
    for(Question q : questions)
    {
      System.out.println("Question No: "+q.getId());
      System.out.println(q.getQuestion());
      System.out.println(q.getOpt1());
      System.out.println(q.getOpt2());
      System.out.println(q.getOpt3());
      System.out.println(q.getOpt4());
      System.out.print("Enter your Answer : ");
      selection[i] = sc.nextLine();
      i++;
      System.out.println();
    }
    printScore();
  }

  public void printScore(){
    
    int score = 0;
    for(int i=0;i<questions.length;i++)
    {
      Question que = questions[i];
      String CrtAns = que.getAnswer();
      String userAns = selection[i];
      if(CrtAns.equals(userAns))
      {
        score++;
      }
    }
    System.out.println("Your Score is : "+score);
  }
}
