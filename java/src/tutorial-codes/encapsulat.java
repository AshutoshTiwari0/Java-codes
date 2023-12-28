// Encapsulation means to keep it hidden. Like we have our brain. It has a lot of information like my name , my house address, my passwords etc. So do i want every info of mine to be avalibale to the outside world? No. I want to keep some things hidden. That is encapuslation. No one from outside world should be able to see it. If they want to access they have to ask my permission(or in java go through methods.)
class human
{
    private int age ;
    private String name;
    public int getAge()
    {
        return age;
    }
    public void setage(int a)
    {
        age=a;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String n)
    {
        name=n;
    }
}


public class encapsulat
{
    public static void main(String[] args) {
     human obj= new human();
     obj.setage(15);
     obj.setname("Ashutosh");


     System.out.println(obj.getname()+" "+obj.getAge());
    }
}