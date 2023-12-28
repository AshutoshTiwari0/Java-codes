import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparatorandcomparavble {
    public static void main(String[] args) {

        new comparator<Integer>()
        {
         /*  public int compare(Integer i, Integer j)
          {
            if(i%10>j%10)
            {
            return 1;
            }
            else{
                return -1;
            }
          }*/

        };
        List<Integer> nums= new ArrayList<>();

        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums);
        System.out.println(nums);
    }
}
