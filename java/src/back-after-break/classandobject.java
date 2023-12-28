import java.util.*;
public class classandobject
{
    public static void main(String[] args)
    {
        bank obj=new bank();
        
        obj.employee("Employee sheetal");
        obj.bankuser("Shivam");

        Scanner ob=new Scanner(System.in);
        System.out.println("enter amount to see if user is rich or not");
        int amount=ob.nextInt();
        obj.account(amount);
        ob.close();
    }
}
class bank
{
    public void employee(String a)
    {
       
System.out.println("employee name is "+a);
    }
    public void bankuser(String b)
    {
System.out.println("the name of accout holder is "+b);
    }

    public void account(int a1)
    {
        if(a1<=1000)
        {
            System.out.println("User has less than 1000 rupees and is below margin");
        }
        else if(a1>1000 && a1<=5000)
        {
            System.out.println("user has more than 1000 and is average");
        }
        else
        {
            System.out.println("user is rich");
        }
    }


}

