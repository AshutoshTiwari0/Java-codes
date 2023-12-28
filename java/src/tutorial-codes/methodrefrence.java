import java.util.Arrays;
import java.util.List;

public class methodrefrence {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Ashutosh","Navin","Anupama","Shivam");
            // we want to convert to upper case 
            // we will create a new list 
            List<String> newupper=names.stream()
                                        //.map(name->name.toUpperCase())
                                        .map(String:: toUpperCase)// this is method referncing har ek string ko convert to uppercase
                                        .toList();
            System.out.println(newupper);
    }
}
