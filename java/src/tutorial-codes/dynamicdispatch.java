
class Aa
{
public void show()
{
    System.out.println("In A show");
}
}
class B extends Aa
{
public void show()
{
    System.out.println("In B show");
}
}
class C extends Aa{
    public void show()
    {
        System.out.println("In C show");
    }
}
public class dynamicdispatch {
    public static void main(String[] args) {
        Aa obj=new Aa();
        obj.show();//in a show

        obj=new B();
        obj.show();// in b show
        

        obj=new C();
        obj.show();
    }
}
