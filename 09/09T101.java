import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> stream = strings.stream();
//调用流API的方法，例如我们希望最多有4个元素
        Stream<String> limit = stream.limit(4);
//最后我们打印结果
        System.out.print("limit = ");
        System.out.println(Arrays.toString(limit.toArray()));
    }
}