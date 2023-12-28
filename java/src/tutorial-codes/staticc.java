class mobile
{
    String brand;
    int price;
     static String name;


public void show()
{
    System.out.println(brand+" "+price+" "+name);
}

}


public class staticc
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


    }
}
