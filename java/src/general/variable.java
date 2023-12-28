package general;

import java.util.Scanner;

class variable
{
    public static void main(String[] args) {
        int a=44;
        int a1;
        a1=a;
        double b=5.2;
        char e='g';
        String g="ashutosh";
        System.out.println(a+" "+b+" "+e+" "+g);


        // data types
        int o=5;
        double r=5.14;
        float y=5f;
        boolean u= true;
        byte b1=2;// limit of byte is from -127 to 127
    
        long h=5421545;
        System.out.println(o+" "+r+" "+y+" "+u+" "+b1+" "+h);

        // type casting
        int k=8;
        double n=(double) k;
        System.out.println(n);

        char t='7';
        System.out.println((int)t);

        //ternary
        int p=5;
        int v=6;
        boolean result=(p>v)?true:false;
        System.out.println(result);

        // switch
        System.out.println("enter choice");
        Scanner ob=new Scanner(System.in);
        int m=ob.nextInt();
        switch(m)
        {
            case 1: 
            // even 
            if(a%2==0)
            System.out.println("number is even");
            break;

            case 2:
            //odd
            if(a%2!=0)
              System.out.println("odd");
              else
              System.out.println("not odd");
                break;

            case 3:
            // pallindrome
            
            while(a!=0)
            {
                int l=a%10;
                r=(r*10)+l;
                a=a/10;

            }
            if(r==a1)
            {
            System.out.println("pallindrome");
            }
            else
            {
                System.out.println("not pallindrome");
            }
            break;
            default:
            System.out.println("wrong choice");
           
        }
        
        ob.close();



    }
}