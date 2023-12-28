 class Ash
{
   public int sum(int a,int b,int c)
    {
        return(a+b);
    }
   public double sum(double a, double b, double c)
    {
        return(a+b+c);
    }
}
public class overloading
{
    public static void main(String[] args) {
        Ash obj=new Ash();
       double d= obj.sum(3,4,5);
       System.out.println(d);
        
    }
}