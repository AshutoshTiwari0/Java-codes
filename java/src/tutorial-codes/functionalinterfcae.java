
// functional interfcae = it has only one method
@FunctionalInterface
 interface A4
 {
void show();
    
}

/*class B implements A
{
    public void show()
    {
        System.out.println("in B show");
    }
}*/





public class functionalinterfcae 
{
    public static void main(String[] args) {
      /*   A4 obj= new A4()
        {
            public void show()
            {*/

                A4 obj= () ->
            {
                System.out.println("in show");
            
        };
        
        obj.show();
    }
}
    


