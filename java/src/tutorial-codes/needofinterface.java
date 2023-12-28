/*abstract class computer
{
    public abstract  void code();

}
 */
// we can also make it interface
interface computer
{
      void code();

}





class laptop implements computer
{
    public void code()
    {
        System.out.println("code sleep repeat");
    }
}
class desktop implements computer
{
       public void code()
    {
        System.out.println("code sleep repeat on desktop");
    }

}

class developer
{
    public void devapp(computer lap)
    {
       // System.out.println("develop android app");
       lap.code();
    }
}


public class needofinterface
 {
    public static void main(String[] args) {

        computer lap=new laptop();
     //   computer desk=new desktop();
        

        developer obj=new developer();
       // obj.devapp();
       obj.devapp(lap);

    }
}
