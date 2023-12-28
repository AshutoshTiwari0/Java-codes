package general;
/* 
class Ahvh 
{

    public void funcofa()
    {
        System.out.println("In class A");
    }
    class Bbhb{
        public void show()
        {
            System.out.println("in side innerclass ");
        }
    }
}
public class innerclass {
    public static void main(String[] args) {
    Ahvh obj=new Ahvh();
       obj.funcofa();
    Ahvh.Bbhb obj1=obj.new Bbhb();
    obj1.show();

    }
}
*/

class add
{
    public void sum(int a, int b)
    {
        System.out.println(a+b);
    }

    class sub
    {
        public void diff(int a,int b)
        {
            System.out.println(a-b);
        }
    }
}
public class innerclass {
    public static void main(String[] args) {
        add obj=new add();
        obj.sum(3,4);

        add.sub obj2= obj. new sub();
        obj2.diff(10,15);

    }
}