//import java.util.ArrayList;
import java.util.Collection;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
class Collections
{
    public static void main(String[] args) {
        /*Collection<Integer> nums=new ArrayList<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(4);

        System.out.println(nums);
        for(int n:nums)
        {
            System.out.println(n);
        }*/


        // to enter unique values where element can not be repeated we have to use "set"
       //  List<Integer> nums=new ArrayList<Integer>();
       // hashet does not have sorted values
       //so we use tree set for getting sorted values,
         // Set<Integer> nums=new HashSet<Integer>();
           Collection<Integer> nums=new TreeSet<Integer>();
       nums.add(55);
           nums.add(78);
             nums.add(64);
               nums.add(88);
              


               // hashset does not have repetitve values.


              /*for(int i=0;i<nums.size();i++)
               {
                System.out.println(nums.get(i));
                }*/
              // System.out.println(nums.indexOf(8));
            //    for(int i:nums)
             //   {
                  //  System.out.println(i);
             //   }

             // we can also use iterator to print out values.
             Iterator<Integer> values=nums.iterator();
             while(values.hasNext())
             {
                System.out.println(values.next());
             }
    }
}
