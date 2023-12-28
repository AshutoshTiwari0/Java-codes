package general;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int n;
      
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number of elemnts inside array");
        n=ob.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("enter elements inside array");
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        // change each elemtent increased by 10
        for(int j=0;j<n;j++)
        {
            b[j]=a[j]+10;
        }
        // printing b
        System.out.println("Array after increment is ");
        for(int k=0;k<n;k++)
        {
            System.out.println(b[k]);
        }
        ob.close();
    }
}
