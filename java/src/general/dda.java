package general;
import java.util.*;
public class dda {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a[][]=new int[2][3];
        System.out.println("enter elements");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]= ob.nextInt();
            }
        }
        // pritning 
        for(int k=0;k<2;k++)
        {
            for(int l=0;l<3;l++)
            {
                System.out.print(a[k][l]+" ");
            }
            System.out.println();
        }
        ob.close();
    }
}
