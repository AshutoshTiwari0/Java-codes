
class Ar
{
public void show1()
{
System.out.println("in ar show");
}
}
class B extends Ar
{
public void show2()
{
System.out.println("in b show");
}
}






public class upcastdowncast {
    public static void main(String[] args) {
        Ar obj=new B();//upcast
        obj.show1();

        B obj1=(B) obj;//downcast
        obj1.show2();

    }
}
