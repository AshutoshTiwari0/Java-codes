package general;



//@FunctionalInterface
interface statebank{
    void interest();
    void compoundinterest();
}



class rbi implements statebank
{
    public void interest()
    {
        System.out.println("Interest generated ");
    }
    public void compoundinterest()
    {
        System.out.println("compound interest generated");
    }
}
public class finterfaces {
    public static void main(String[] args) {
        rbi obj=new rbi();
        obj.interest();
    }
}

