package general;
class AS{
    public void func(int a, int b)
    {
        System.out.println("sum is "+ (a+b));
    }
    public void product(int a,int b)
    {
        System.out.println("product is "+ (a*b));
    }
}
public class objects {
    public static void main(String[] args) {
        AS obj =new AS();
        obj.func(5, 80);
        obj.product(7, 5);
    }
}
