enum status 
{
    // status is like a class 
    Running, Failure, Success, Pending;// these are objects of class status
}

public class enums {
    public static void main(String[] args) {
        



        status s=status.Success;
        System.out.println(s.getClass().getSuperclass());

                status r=status.Running;
        status f=status.Failure;
        System.out.println(f);
        System.out.println(r.ordinal());// ordinal returns the position at which the element is present like here running is at zero
        System.out.println(f.ordinal());// failure is at 1 inside enum status class.
        status[] allvalues= status.values();
        System.out.println(allvalues[0]);
        // to print all the values we can use a for loop
        for(int i=0;i<4;i++)
        {
            System.out.println(allvalues[i]);
        }


        // enum if and switch
        status a=status.Failure;

        if(a==status.Failure)
        {
            System.out.println("pending and failure are diff");
        }
    
    else if(a==status.Running)
    {
        System.out.println("pending and running are diffenrent");
    }
    else if(a==status.Success)
    {
        System.out.println("pending and success are different");
    }
    else
    {
        System.out.println("same");
    }


    // enum also supports switch
    status g=status.Running;

    switch(g)
    {
        case Running:
        System.out.println("running switch");
        break;

        case Failure:
        System.out.println("failed switch");
        break;

        case Success:
        System.out.println("success switch");
        break;

        default:
        System.out.println("pending switch");
    }

    
}
}