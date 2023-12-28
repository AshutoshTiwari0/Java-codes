package general;
class ashut{
    double interest;
public void interest(int p, int r, int t)
{
interest =(p*r*t)/100;
System.out.println(interest);
}

public void interest(double d, double e, double f)
{
interest=(d*e*f)/100;
System.out.println(interest);

}
}
public class overload {
    public static void main(String[] args) {
        ashut obj=new ashut();
        obj.interest(4,5,6);
        obj.interest(7.2,5.2,4.2);

    }
}
