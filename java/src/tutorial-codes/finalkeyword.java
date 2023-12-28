// a final keyword can be used with a method,class,variable
 class calcu{
public final void show()
{
    System.out.println("in calc show made by ashutosh");
}
public void add(int a,int b)
{
    System.out.println(a+b);
}
}
/* it is message to stop error in vs code as show is final so cant be inherited.
class advcalcu extends calcu{
public void show()// error since show is final
{
    System.out.println("used by other person and no credit");
}
}
 */

public class finalkeyword {
    public static void main(String[] args) {
       // final int num=8; this is final variable
      
        //System.out.println(num);

       // advcalcu obj=new advcalcu();
       // obj.show();
       // obj.add(4,5);



    }
}
