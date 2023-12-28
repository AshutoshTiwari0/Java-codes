public class loopspractice
 {
    public static void main(String[] args) 
    {
        int i,j;
      //pattern 1
       /*  for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        } */

        /*pattern 2
                   1
                2     2
             3     3      3
          4     4      4       4

    */
    for( i=1;i<=4;i++)
    {
        for(int k=1;k<=(4-1);k++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print(i);
        }
       
    
     System.out.println();
}
 }  
}
