import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
       /*  System.out.println("enter a string");
        String a=ob.nextLine();
        String b=ob.nextLine();
        int c=a.length()+b.length();
        System.out.println(c);
        ob.close();*/
        // strings are immutable in java 
        // to make mutable strings in java we use string bulider and string buffer.
        StringBuilder sb=new StringBuilder("Ashutosh ");
        System.out.println(sb.append("tiwari"));
        System.out.println(sb.indexOf("ti"));
        System.out.println(sb.deleteCharAt(5));
        System.out.println(sb.reverse());
        ob.close();
    }
}
