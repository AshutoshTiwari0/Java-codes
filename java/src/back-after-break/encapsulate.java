
class passwords
{
    private int a=5;
     private int b=4;
        private int c;
  /*  public int sum()
    {
       a=5;
        b=6;
     c=a+b;
     return c;
    } */
public int getA() {
    return a;
}
public void setA(int a) {
    this.a = a;
}
public int getB() {
    return b;
}
public void setB(int b) {
    this.b = b;
}
public int getC() {
    return c;
}
public void setC(int c) {
    this.c = c;
}
public int sum()
{
    int d=a+b;
    return d;
}
}

public class encapsulate
 {
public static void main(String[] args) {
    passwords obj=new passwords();
   int d=obj.sum(); 
    System.out.println(d);
    
}
}
