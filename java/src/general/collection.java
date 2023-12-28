package general;


import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;
public class collection {
    public static void main(String[] args) {/*
        Scanner ob=new Scanner(System.in);

        System.out.println("Enter number of elements to be added inside arraylist");
        int n=ob.nextInt();
        ArrayList<Integer> nums= new ArrayList<>();


        System.out.println("enter values");
        for(int i=1;i<=n;i++)
        {
          int p=ob.nextInt();
          nums.add(p);
        
        }
        // printing the arraylist
         System.out.println(nums);
        // sorting
        nums.sort(null);
        System.out.println(nums);
               ob.close();

*/
               // creating a map

    Map<String, Integer> nums= new HashMap<>();

    nums.put("Navin",100 );
    nums.put("Ashutosh",88 );
    nums.put("Shiavm",46 );
    nums.put("Abhishek",56 );

      
   // nums.remove("Navin");
    
   System.out.println(nums.size()); 

  
    System.out.println(nums.values());
   

    // printing using for eac
    for(String n:nums.keySet())
    {
        System.out.println(n);
    }

    }
}
