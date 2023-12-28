package general;

import java.util.Scanner;

// making factroial program by recursion


class factorial
{
public int fact(int n)
{

    if(n==1)
    {
        return 1;
    }
    else{
    return n*fact(n-1);
    }
}
}


class factorialover extends factorial
{
public int fact(int n)
{

    if(n==1)
    {
        return -1;
    }
    else{
    return 4500;
}
}
}

class ovveride
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number for factorial");
        int h=ob.nextInt();
        factorial obj=new factorialover();
       int result= obj.fact(h);
       System.out.println(result);
       ob.close();


    }
}
