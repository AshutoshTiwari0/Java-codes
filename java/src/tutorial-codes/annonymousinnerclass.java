abstract class Ash
{
   /* public void show()
    {
System.out.println("in A show");
    }*/

    public abstract void show();


}
/*class Bash extends Ash{
    public void show()
    {
        System.out.println("in B show");
    }
}
*/
class B extends Ash
{

    
    public void show() 
    {
        System.out.println("in B show");
    }

}






public class annonymousinnerclass
 {
    public static void main(String[] args) {
        
    //annonymous class 
  /*/  Ash obj=new Ash() 
    {
public void show()
    {
System.out.println("in new implementation show");
    }
    };
    obj.show();*/

    Ash obj=new Ash()
     {
         public void show()
    {
        System.out.println("in new show");
    }
    };
    obj.show();

}
 }
