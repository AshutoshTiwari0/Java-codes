
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


public class defaultparametrize
{
    public static void main(String[] args) {
     human obj= new human();
   

     System.out.println(obj.getname()+" "+obj.getAge());
    
   obj.setage(15);
 obj.setname("Ashutosh");


    }
}