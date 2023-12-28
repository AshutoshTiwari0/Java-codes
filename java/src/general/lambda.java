package general;
interface s{
    int base(int a, int b);
}
class F implements s{
    public int base(int g, int f)
    {
       return(f*g); 
    }
}
public class lambda {
    public static void main(String[] args) {
        /* 
       F obj=new F()
       {
    public int base(int p , int q)
        {
            return p*q*4;
        }
       };

*/
       s obj=(p,q)-> p*q*4;
     int y=  obj.base(7,8);
     System.out.println("area is "+ y);
    }
}
