// we defnie an interface instead of class when we have only abstract methods in class
/*abstract class A
{
public abstract void show();
public abstract void config();

} */

// functions inside interface are by default public and abstract
// here functions show and config are public and abstract.
 interface  Afg 
 {
    // we can also declare variables inside an interface 
    int age=19;
    String name="Ashutosh";// this gives error bcoz varaiabkes inside interface are by default final and static.

     void show();
     void config();
    
}
interface X
{
void run();
}

interface Y extends X
{

}
// in b class we are implementing both the methods.
class Bfg implements Afg,Y
{
    public void show()
    {
        System.out.println("in b show");
    }
    public void config()
    {
    System.out.println("in b config");
    }
    public void run()
    {
        System.out.println("in B run");
    }
}




public class interface2code
 {
    public static void main(String[] args) {
        
       // obj=new A();
       // can not create object of interface.
       // since we have a class b which is implementing functions of A we can create object of b
       Afg obj=new Bfg();
       obj.show();
       obj.config();

       X obj1=new Bfg();
        obj1.run();
       System.out.println(Afg.age);// since age is static it can be accessed using class name no need of object.
       System.out.println(Afg.name);
    }
}
// Aim of this file is to show can a class implement mulitple interfaces?
// Ans) YES.
// class ->class = extends
// interface->interface= extends
// class->interface= implements
