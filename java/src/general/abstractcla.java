package general;

 abstract class Ashutosh{
    public abstract void func1();
    public abstract void func2();
 }


 class Ashutext extends Ashutosh
 {
public void func1()
{
    System.out.println("in a fucn 1");
}


public void func2() {
    System.out.println("in func 2");
}
 }
public class abstractcla {
    public static void main(String[] args) {
        Ashutext obj=new Ashutext();
        obj.func1();
        obj.func2();
    }
}
// we can not create object of abstract class 