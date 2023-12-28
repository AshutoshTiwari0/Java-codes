package Quizproject;
import java.util.Scanner;
public class Questionservice {

    Question[] questions = new Question[5];
    String selection[]=new String[5];

        public Questionservice()//constructor
        {
            questions[0]=new Question(1,"what is capital of India?","New Delhi","Lucknow","Jaipur","Kolkata","New Delhi");
             questions[1]=new Question(2,"what is national animal of India?","Lion","Koala","Tiger","Panda","Tiger");
              questions[2]=new Question(3,"what is powehouse of cell?","Ribosomes","Amobea","Planktons","Mitochondria","Mitochondria");
               questions[3]=new Question(4,"when is independence day celebrated?","17 aug","18 aug","15 aug","10 aug","15 aug");
                questions[4]=new Question(5,"what is full form of RBI?","Reserve Bank of India","Reserve Bank Of Indonesia","Resoucre bank of Italy","Reserve bank of Iran","Reserve Bank of India");

        }
    public void playQuiz()
    {
        int i=0;
        for(Question q:questions)
        {
        System.out.println("QUESTION NO."+q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
          System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
              System.out.println(q.getOpt4());
              Scanner ob=new Scanner(System.in);
             selection[i]= ob.nextLine();
             i++;
             ob.close();
    }
    for(String s: selection)
    {
        System.out.println(s);
    }
}
    public void printscore()
    {
        int score=0;
        for(int i=0;i<questions.length;i++)
        {
            Question ques=questions[i];
            String actualanswer=ques.getAnswer();
            
            String useranswer=selection[i];
            if(actualanswer.equals(useranswer))
            {
                score++;
            }

        }
        System.out.println("Your score is ="+ score);
    
    }
    
}


