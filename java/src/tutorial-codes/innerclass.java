class A1
{

    int age;

    public void show()
    {
        System.out.println("inside class A");
    }
    static class B2
    {
        public void config()
        {
            System.out.println("inside class B ");
        }
    }
}

public class innerclass 
{
    public static void main(String[] args) {
        A1 obj=new A1();
        obj.show();
        A1.B2 obj2=new A1.B2();
        obj2.config();

    }
}
