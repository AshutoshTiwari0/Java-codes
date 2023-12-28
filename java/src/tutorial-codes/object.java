class calculator
{
    public int add(int n1, int n2)
    {
        int r=n1+n2;
        return r;
    }
}

public class object 
{
    public static void main(String[] args) {
int num1=4 , num2=5;
calculator calc=new calculator();
int result=calc.add(num1,num2);
System.out.println(result);
    }
}
