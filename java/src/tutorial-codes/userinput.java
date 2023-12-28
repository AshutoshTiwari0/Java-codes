//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.*;

public class userinput {
    public static void main(String[] args) //throws IOException {
       { System.out.println("enter a number");
      //  int num=System.in.read();
       // System.out.println(num-48);
      // InputStreamReader in=new InputStreamReader(System.in);
       // BufferedReader bf=new BufferedReader(in);
       // int num=Integer.parseInt(bf.readLine());
       // System.out.println(num);
       // bf.close();

       Scanner ob=new Scanner(System.in);
       int num=ob.nextInt();
       System.out.println(num);
       ob.close();
    }
}
