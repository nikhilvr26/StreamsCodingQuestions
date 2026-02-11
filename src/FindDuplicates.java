import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    static void main() {
        int[] arr = {2,3,1,2,5,4,1,4,2};
        Set<Integer> duplicates = new HashSet<>();

        Set<Integer> set = Arrays.stream(arr)
                .boxed()
                .filter(i -> !duplicates.add(i))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(set);
    }
}
