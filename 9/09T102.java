import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("I", "am", "a", "list", "of", "Strings");
        List<String> newstrings = strings.stream()
                        .limit(4)
                        .collect(Collectors.toList());
        System.out.print("limit = "+ newstrings);
    }
}