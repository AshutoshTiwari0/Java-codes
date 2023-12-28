
import java.util.*;
 public class furnituresection 
 {
    String name[]={"table","chair","televison","drressing table","desk"};
     int cost[]=new int[5];
    public void furnituredetails()
    {
        Scanner ob= new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("enter cost of "+name[i]);
             cost[i]=ob.nextInt();
             ob.close();
        }
    }
        public void display()
        {
            for(int k=0;k<5;k++)
            {
                System.out.println("cost of"+name[k]+"="+cost[k]);
            }
           

        }
    }
    

