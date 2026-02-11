import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequency {
    static void main() {
        int[] arr = {2,3,1,2,5,4,1,4,2};

        Map<Integer, Long> countFreq = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(a -> a, LinkedHashMap::new, Collectors.counting()))
                        .entrySet().stream()
                        .filter(i -> i.getValue() > 1)
                                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(countFreq);
    }
}
