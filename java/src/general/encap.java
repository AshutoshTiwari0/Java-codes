package general;
class ab{
    private String a="Ashutosh";
    public String getdata()
    {
        return a;
    } 

    public String setdata()
    {
        this.a="Tiwari";
        return a;
    }

}
public class encap
{
    public static void main(String[] args) {
        ab obj=new ab();
        obj.getdata();
       String h= obj.setdata();
       System.out.println(h);
    }
}