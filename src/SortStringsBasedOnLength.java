import java.util.Comparator;
import java.util.List;

public class SortStringsBasedOnLength {
    public static void main(String[] args) {
        List<String> stringList = List.of("Watermelon", "Banana", "Grapes", "Oranges", "Apple");
        List<String> sortedList = stringList
                .stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println(sortedList);
    }
}
