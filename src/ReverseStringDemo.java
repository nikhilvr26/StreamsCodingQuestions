import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringDemo {
    public static void main(String[] args) {
        String original = "This is a string";
        String reverse = IntStream.range(0, original.length())
                .mapToObj(i -> original.charAt(original.length()-1-i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(reverse);
    }
}
