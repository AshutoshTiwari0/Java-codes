public class exceptions 
{
    public static void main(String[] args) {
        //int i=0;
        int i=2;
        int j=2;
        String p="";
        int  nums[]=new int[5];
        try{
            j=18/i;
        //    System.out.println(nums[0]);
            System.out.println(nums[7]);
            System.out.println(p.length());
        }
        catch(ArithmeticException e){
            System.out.println("can not divide by zero");
        }
          catch(ArrayIndexOutOfBoundsException f)
        {
System.out.println("Array indexing is incorrect");
        }
        catch(Exception a)
        {
            System.out.println("sab yaha aao mere exceptions");
        }
        System.out.println(j);
    }
}
