//class Ashutosh extends Thread
/*class Ashutosh implements Runnable
{
public void run()
{
    for(int i=1;i<=1000;i++)
    {

    }
    
}
}

class Ashutosh2 implements Runnable
{
public void run()
{
    for(int i=1;i<=1000;i++)
    {
        
    }
    
}
}
*/
class counter
{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}





public class threads {
    public static void main(String[] args) {
        //Ashutosh obj=new Ashutosh();
        // Ashutosh2 obj2=new Ashutosh2();
         // get priority is used to tell priorty of a thread
        // System.out.println(obj.getPriority());
         // obj2.setPriority(Thread.MAX_PRIORITY);
      //  obj.start();
       /*/ try {
        Thread.sleep(2);
    } catch (InterruptedException e) {
        
        e.printStackTrace();
    }*/
      //  obj2.start();
     /*  Runnable obj1=new Ashutosh();
      Runnable obj2=new Ashutosh2();


      Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
*/
        counter c=new counter();
        for(int i=1;i<=1000;i++)
        {
            c.increment();
        }
    }
}
