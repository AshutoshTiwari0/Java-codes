import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class stream2 {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(4);
          nums.add(5);
            nums.add(7);
              nums.add(3);
                nums.add(2);
                  nums.add(6);
          
    Stream<Integer> sortedvalues=nums.stream()
                                     .filter(n->n%2==0)
                                     .sorted();
          sortedvalues.forEach(n->System.out.println(n));                                            

    }
}
