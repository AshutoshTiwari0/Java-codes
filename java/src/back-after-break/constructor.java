class defconstruc
{
    String name;
    int sum;
defconstruc()
{
     name="Mr.";
     sum=0;
}
void entername()
{
System.out.println(name+"Ashutosh");
}
void sum()
{
    for(int i=0;i<5;i++)
    {
        sum=sum+i;
    }
    System.out.println(sum);
}
}
class constructor
{
    public static void main(String[] args) 
    {
defconstruc obj=new defconstruc();
obj.entername();
obj.sum();
    }

}