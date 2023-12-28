
class human
{
    private int age ;
    private String name;


    public human()//default constructor
    {
      age=10;
      name="Ash";
    }
    public human(int a,String n)//parametrized
{
    age=a;
    name=n;
}


    public int getAge()
    {
        return age;
    }
    public void setage(int age )
    {
        
        
        this.age=age;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
       this.name=name;
    }
}


public class thiss
{
    public static void main(String[] args) {
     human obj= new human();
    human obj1=new human(18,"tiwari");

     System.out.println(obj.getname()+" "+obj.getAge());
       System.out.println(obj1.getname()+" "+obj1.getAge());
   // obj.setage(15);
 //obj.setname("Ashutosh");


    }
}