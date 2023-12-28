import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;
import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.stream.Stream;

public class streamapi {
    public static void main(String[] args) {
       // int sum=0;
        List<Integer> nums=new ArrayList<Integer>(); 
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(1);
        // we can also add like this
        //List<Integer> nums= Arrays.asList(5,2,8,1);
      //  System.out.println(nums);
      // printing methods

      // method 1
      //for(int i=0;i<nums.size();i++)
      //{
        //System.out.println(nums.get(i));
      //}

      // method 2
     // for(int n:nums)
     // {
       // System.out.println(n);
      //}

      // method 3 using for each

       // nums.forEach(n->System.out.println(n));
/* 
        for(int n: nums)
        {
        if(n%2==0)
        {
         n=n*2;
        sum=sum+n;
        }
         }
                                                    
    System.out.println(sum);*/


  /*  Consumer<Integer> con=new Consumer<Integer>() {
        public void accept(Integer n)
        {
            System.out.println(n);
        }
    };*/

        // using lamda expression here
     
   /* Consumer<Integer> con=( Integer n)->
    {
        System.out.println(n);
    
        };
    

    nums.forEach(con);
    */
       /*Stream<Integer> s= nums.stream();
    nums.forEach(n-> System.out.println(n));

        s.forEach(n-> System.out.println(n));
        // we can use stream only once yaha pe do baar nhi print hoga bcoz ek baar ho chuka hai print. if do baar then exception aaega
       // s.forEach(n-> System.out.println(n));
       Stream<Integer> s2=s.filter(n->n%2==0);
       Stream<Integer> s3=s2.map(n->n*2);


       //s2.forEach(n->System.out.println(n));
      // s3.forEach(n->System.out.println(n));
        int result=s3.reduce(0,(c,e)->c+e);
        System.out.println(result);
    */

       /*  Predicate<Integer> p=new Predicate<Integer>() {

            @Override
            public boolean test(Integer n) {
                
                if(n%2==0)
                {
                    return true;
                }
                else{
                    return false;
                }
            }
            
        };
*/

Function <Integer,Integer> fun=new Function<Integer, Integer>() {
    public Integer apply(Integer n)
    {
        return n*2;
    }
};

int result=nums.stream()
                .filter(n->n%2==0)
                .map(fun)
                .reduce(0, (c,e)->c+e);

      System.out.println(result);          



      }
    }
