import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,22,3,4,4,5,6,2);
        List<Integer> listWithoutDuplicates = intList
                .stream()
                .distinct()
                .toList();
        System.out.println(listWithoutDuplicates);

        List<String> stringList = Arrays.asList("Apple", "Oranges", "Apple", "Banana");
        List<String> stringListWithoutDuplicates = stringList
                .stream()
                .distinct()
                .toList();
        System.out.println(stringListWithoutDuplicates);
    }
}
