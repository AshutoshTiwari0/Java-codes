package general;
class Asd
{
  int s;
  String name;
   /* Asd()
    {
        String name="Ashutosh";
         s=100;
         System.out.println("Called soon after object creation");
    }*/

     Asd(String n, int m)
    {
         name=n;
         s=m;
        // System.out.println("Called soon after object creation");
        System.out.println("Annonymous is working");
    }
   /*  public void sum(int a, int b)
    {
        int d=a+b;
        int h=s+d;
        System.out.println(h);
    }*/

    public void show()
    {
        System.out.println(name.length());
        System.out.println("sum is "+ s);
    }
}
public class constructor {
    public static void main(String[] args) {
        Asd obj=new Asd("Ashutosh",100);
        obj.show();

        // annonymous objec
         new Asd("Ashutosh",100);
        
    }
}
