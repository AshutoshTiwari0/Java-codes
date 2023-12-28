class calc
{
public int add(int n1,int n2)
{
return n1+n2;
}




}

class Advcalculator extends calc
{
public int add(int n1,int n2)
{
   return n1+n2+1;
}
}




public class overriding {
    public static void main(String[] args) {
      Advcalculator obj=new Advcalculator();
      int sum=obj.add(2,3);
      System.out.println(sum);
    }
}
