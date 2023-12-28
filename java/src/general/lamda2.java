package general;

import java.util.Scanner;

@FunctionalInterface
interface s
{
    String playsong(String h);
}


public class lamda2 {
    public static void main(String[] args) {

        
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the rapper name");
        String s=ob.nextLine();



        s obj=(name)->
        {String list[]={"Uday Pandhi","Gaush","Bassick"};
     
        for(int i=0;i<list.length;i++)
        {
            if(name.equals(list[i]))
            {
            System.out.println("phenomal");
            }
            
        }
       return "Thanks for your time";
    };
       String h= obj.playsong(s);
       System.out.println(h);
    ob.close();

    }
}
