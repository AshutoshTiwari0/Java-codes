
    
// functional interfcae = it has only one method
@FunctionalInterface
interface AG
{
//void add(int i);
int add(int i,int j);
   
}

/*class B implements A
{
   public void show()
   {
       System.out.println("in B show");
   }
}*/





public class functionalinterfcae2 
{
   public static void main(String[] args) {
     /*   A4 obj= new A4()
       {
           public void show()
           {*/

          AG obj=( i, j)->i+j;
          

          int result=obj.add(5,4);
          System.out.println(result);
   
}
}
   




