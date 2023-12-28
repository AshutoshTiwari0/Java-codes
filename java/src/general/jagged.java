package general;
import java.util.*;
public class jagged {
    public static void main(String[] args) {
        int a[][]=new int[3][];
        a[0]=new int[3];
        a[1]=new int[7];
        a[2]=new int[1];
        Scanner ob=new Scanner(System.in);
       for(int i=0;i<a.length;i++)
       {
        for(int j=0;j<a[i].length;j++)
        {
            a[i][j]=ob.nextInt();

        }
       }
       // printing 
        for(int i=0;i<a.length;i++)
       {
        for(int j=0;j<a[i].length;j++)
        {
          System.out.print(a[i][j]+" ");

        }
        System.out.println();
       }
       ob.close();
    }
}
