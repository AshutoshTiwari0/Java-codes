package general;
class v{
public int sum(int a, int b)
{
return a+b;
}
}
/* 
class p
{
    public int product(int a,int b)
    {
        return a*b;
    }
}
*/

public class annonymousinner {
    public static void main(String[] args) {
        v obj=new v()
        {
        
            public int sum(int a, int b)
            {
                return(a*b);
            }
            
           
        };

       int r= obj.sum(10,10);
       System.out.println(r);
        
        
       /*int d= obj.sum(5, 8);
       System.out.println(d);

       /*p ob=new p();
       int p=ob.product(7,7);
       System.out.println(p);*/
    }
}
