import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountMostFrequencyNumber {
    static void main() {
        int[] arr = {2,3,1,2,5,4,1,4,2};

        Map.Entry<Integer, Long> mostFrequency = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(a -> a, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(mostFrequency.getKey() + " : " + mostFrequency.getValue());
    }
}
