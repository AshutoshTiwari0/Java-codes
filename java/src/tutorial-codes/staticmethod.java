class mobile
{
    String brand;
    int price;
     static String name;


public void show()
{
    System.out.println(brand+" "+price+" "+name);
}

public static void show1(mobile obj)
{
    System.out.println(obj.brand+" "+obj.price+" "+name);
}


}


public class staticmethod
{
    public static void main(String[] args) {
        mobile obj1= new mobile();
        obj1.brand="Motorola";
        obj1.price=20000;
        mobile.name="smartphone";

        mobile obj2= new mobile();
obj2.brand="samsung";
obj2.price=50000;
mobile.name="smartphone";

mobile.name="phone";

obj1.show();
obj2.show();

mobile.show1(obj1);

    }
}