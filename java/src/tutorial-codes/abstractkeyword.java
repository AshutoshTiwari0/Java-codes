 abstract class car
{
    public abstract void drive();
    public abstract void fly();
    
    public void playmusic()
    {
        System.out.println("playing music");
    }
}

class wagonr extends car{
    public void drive()
    {
        System.out.println("the car is driving");
    }
    public void fly()
    {
        System.out.println("car can fly");
    }
}

public class abstractkeyword 
{
    public static void main(String[] args) 
    {
        car obj=new wagonr();
        
        obj.drive();
        obj.fly();
    }
}
 



