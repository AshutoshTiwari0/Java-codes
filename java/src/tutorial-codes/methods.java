class computer
{
    public void playmusic()
    {
        System.out.println("music playing");

    }
    public String getmeapen(int cost)
    {
        if(cost>=10)
    
        return "Pen";
        
        else
            return "nothing";
        
    }
}


public class methods {
    public static void main(String[] args) 
    {
        computer obj= new computer();
        obj.playmusic();
       String b= obj.getmeapen(20);
       System.out.println(b);
    }
}
