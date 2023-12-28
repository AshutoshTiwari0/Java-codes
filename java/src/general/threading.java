package general;
// just extend with thread and set priority (range=0 to 10)
// . sleep() stops the execution of that thread for a particular time 
// Threads generally rely on execution capability of the machine. So they are highly unpredictable.
class Ddd extends Thread
{
    public void run()
    {
       for(int i=1;i<10;i++)
       {
        System.out.println("I am running");
       }
    }
}

class EEE extends Thread
{
    public void run()
    {
        for(int t=1;t<=10;t++)
        {
            System.out.println("I am also running");
        }
    }
}
public class threading {
    public static void main(String[] args) {
        Ddd obj=new Ddd();
        
        //obj.start();
       // System.out.println(obj.getPriority());

        obj.setPriority(4);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        EEE ob=new EEE();
        //ob.start();
       // System.out.println(ob.getPriority());

        ob.setPriority(10);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
           
            e.printStackTrace();
        }
        
        ob.start();
        obj.start();
    }
}
