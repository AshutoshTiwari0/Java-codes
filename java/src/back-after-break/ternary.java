import java.util.*;
public class ternary {
    public static void main(String[] args) {
        //prime usimg ternanry
        int c=0;
        Scanner ob = new Scanner(System.in);
            System.out.println("enter the number");
            int a=ob.nextInt();
            for(int i=2;i<a;i++)
            {
                if(a%i==0)
                {
                    c++;
                }

            }
        
        System.out.println( c==0 ? "prime":"not prime"); 
        ob.close();
    }
}

