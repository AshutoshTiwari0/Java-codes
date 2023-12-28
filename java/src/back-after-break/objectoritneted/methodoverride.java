package objectoritneted;

// ye work karta hai inheritance mai 
// if same function is defined in base class and as well as derived class then the function in derived class will override.same program chaap de rha for reference.


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
   return n1+n2+1;// this function will work.
}
}




public class methodoverride {
    public static void main(String[] args) {
      Advcalculator obj=new Advcalculator();
      int sum=obj.add(2,3);
      System.out.println(sum);
    }
}
