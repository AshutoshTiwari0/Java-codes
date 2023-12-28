import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class parallelstream {
    public static void main(String[] args) {
        int size=100;
        List<Integer> n=new ArrayList<>(size);
        Random r=new Random();
        for(int i=1;i<=size;i++)
        {
            n.add(r.nextInt(100));
        }
        //System.out.println(n);

       /*  int sum=n.stream()
                    .map(i->i*2)
                    .reduce(0,(c,e)->c+e);


        System.out.println(sum);*/
        // another way for adding

        long start=System.currentTimeMillis();
        int sum2= n.stream()// normal stream
        .map(i->{
            try
            {
                Thread.sleep(1);
            }
            catch(Exception E)
            {

            }
            return i*2;
        })
        .mapToInt(i->i)
        .sum();
        
    System.out.println(sum2);
        long end=System.currentTimeMillis();

        System.out.println("time taken with stream is "+(end-start));


        // parallel stream
        long startparallel= System.currentTimeMillis();
     int sum3= n.parallelStream() // parallel stream
        .map(i->{
            try
            {
                Thread.sleep(1);
            }
            catch(Exception E)
            {

            }
            return i*2;
        })
        .mapToInt(i->i)
        .sum();
        long endparallel= System.currentTimeMillis();
    System.out.println(sum3);
    System.out.println("time taken with parallel stream is "+(endparallel-startparallel));

    }
}
