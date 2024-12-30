import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringInList {
    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String> result = stringList
                .stream()
                .max(Comparator.comparingInt(String::length));
        if (result.isPresent()) {
            System.out.println(result.get());
        }else{
            System.out.println("its empty");
        }
    }
}
