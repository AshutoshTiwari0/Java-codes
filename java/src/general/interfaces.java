package general;
interface p{
   public abstract int factorial(int h);
    int pallindrome(int p);
}
interface r
{
    void print();
}
interface q extends r{
void printanother();
}
class t implements p,r{
   public int factorial(int h)
    {
      if(h==1 || h==0)
      {
        return 1;
      }
      else{
        return (h*factorial(h-1));
      }
    }
    // implementing second function
    public int pallindrome(int p)
    {
        int r=0;
        int l=p;
        while(p!=0)
        {
            int b=p%10;
            r=(r*10)+b;
            p=p/10;
        }
        if(r==l)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
   public void print()
    {
        System.out.println("implemented print method of interface");
    }
    }
    class k implements q{
       public void print()
        {
            System.out.println("Again implementing print");
        }
       public void printanother()
        {
            System.out.println("chal chal chal chal nikal bhag yaha se --fotty seven");
        }
    }
public class interfaces {
    public static void main(String[] args) {
        t obj=new t();
       int y= obj.factorial(5);
       System.out.println("factorial is "+y);
       int h= obj.pallindrome(121);
       if(h==1)
       {
        System.out.println("number is pallindrome");
       }
       else{
        System.out.println("number is not pallindrome");
       }
       obj.print();
       k object=new k();
       object.print();
       object.printanother();
    }
}
