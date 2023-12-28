import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> students=new HashMap<>();
        students.put("Ashutosh",55);
        students.put("Harsh",75);
        students.put("Abhishek",85);
        students.put("Krishna",95);
        // if we change exsisting value we can do so
        students.put("Ashutosh",85);
        System.out.println(students);
        // we will not get in sequence

        System.out.println(students.get("Harsh"));
        // we will 75 which is value for harsh

        System.out.println(students.keySet());// prints all values but not in sequence

        // to print in sequence
        for(String key : students.keySet())
        System.out.println(key+" "+students.get(key));


        
     
    }
}
