 // dynamic method dispatch
    // in this we make classes and inherit them and we make a new object each time for a new class and assign all the objects to one varibale only 
    // obj= new a();
    // obj=new b();
   // obj=new c();
   // here each time a new object is created and assigned to same variable . so same variable is exsiting in many different forms.




public class dynamicmethoddispatch
 {
   
public static void main(String[] args) {
    A obj=new A();
    obj.sum(3,5);

     obj=new B();/// yhi hai dynamic method dispatch bas ye single line.
     obj.sum(4,10);
}
}

class A{
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
   }
   class B extends A
   {
    void sum(int a,int b)
    {
        System.out.println(a*b);
    }
   }
