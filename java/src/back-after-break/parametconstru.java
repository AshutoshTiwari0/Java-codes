import java.util.*;
public class parametconstru
{
    public static void main(String[] args)
     {
    Scanner ob=new Scanner(System.in);
    System.out.println("enter length");
    int a=ob.nextInt();
    System.out.println("enter breadth");
      int b=ob.nextInt();
      System.out.println("enter height");
        int c=ob.nextInt();
    parameter obj=new parameter(a,b,c);
    int g=obj.area();
    System.out.println("area "+g);//area
    
    int h=obj.volume();
    System.out.println("volume "+h);//volume
    ob.close();
    }
} 
class parameter
{
    int l,b,h;
    parameter(int length, int breadth, int height)
    {
         l=length;
         b=breadth;
         h=height;
    }
    int area()
    {
        int are=l*b;
       return(are);
    }
    int volume()
    {
        int vol=l*b*h;
        return(vol);
    }

}

