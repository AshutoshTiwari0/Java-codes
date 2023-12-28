import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optionalclass {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Ashu","kabir","tanu","raghav");

        Optional<String> name=names.stream()
                        .filter(str->str.contains("x"))
                        .findFirst();
    System.out.println(name.orElse("There is no name with X in it"));
    }
}
