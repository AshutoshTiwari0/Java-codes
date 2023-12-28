public class exception2 {
    


    public static void main(String[] args) {
        //int i=0;
       // int i=0;
      //  int j=0;
      int i=20,j=0;
        try{
            Class.forName("xyz");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("class unavailable");
        }
        try{
            j=18/i;
            if(j==0)
            {
                throw new ArithmeticException();
            }
       
        }
        catch(ArithmeticException e){
            //System.out.println("can not divide by zero");
            j=18/1;
            System.out.println("default output");
        }
  
        catch(Exception a)
        {
            System.out.println("sab yaha aao mere exceptions");
        }
        System.out.println(j);
    }
}
