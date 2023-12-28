import java.util.*;
public class cas
{
    public static void main(String args[])
    {
         Scanner obj=new Scanner(System.in);
        System.out.println("enter choice");
         int choice=obj.nextInt();
       
        System.out.println("enter number");
     int a=obj.nextInt();
        int r=0, i=1;
        switch(choice)
        {
            case 1:
            // check if a is odd
            if(a%2==1)
            {
                System.out.println("odd");
            }
            else
            {
                System.out.println("even");
            }
            break;
            case 2:
            //check if a is paalindrome
            int n=a;
            while(a!=0)
            {
                int c=a%10;
                r=(r*10)+c;
                a=a/10;

            }
            if(r==n)
            {
                System.out.println("pallindrome");
            }
            else
            {
                System.out.println("not pallindrome");
            }
            break;
            case 3:
            //check if a is perfect square
            do{

            if(a==(i*i))
            {
                System.out.println("perfect square");
            }
            i++;
        }
        
        while(i>0);
       
        break;
 default:
        System.out.println("wrong choice");

        }
       obj.close(); 
    }
}