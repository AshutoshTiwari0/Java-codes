import java.util.*;
public class trywithresources {
    public static void main(String[] args) {
        //int i=2;
        //int j=0;
 
        
        try( Scanner ob=new Scanner(System.in)){
            //j=18/i;
           // System.out.println("bye");
       //  ob=new Scanner(System.in);
           int num=ob.nextInt();
           System.out.println(num);
         
        }
        catch(Exception e)
        {
            System.out.println("wrong ");
        }
        finally{
            System.out.println("i am always executed");
              
           // ob.close();
        }
    }
}
