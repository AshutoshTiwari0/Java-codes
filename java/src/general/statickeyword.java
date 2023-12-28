package general;
class d{
String name;
String brand;

static String area;

public void show()
{
System.out.println(name+" "+brand+" "+area);
}
}




// we called static through class name and not by object
public class statickeyword
{
    public static void main(String[] args) {
        d obj=new d();
        obj.brand="Dell";
        obj.name="Ash";

        d.area="Amravati";
        obj.show();

        d ob=new d();
        ob.brand="HP";
        ob.name="Ahu";

        d.area="Gujarat";

        ob.show();
    }
}
