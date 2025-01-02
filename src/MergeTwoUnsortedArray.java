import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoUnsortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2,7,3,9,6};
        int[] arr2 = {5,1,10,4,8};

        int[] sortedArray = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed())
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("Sorted merged array : "+ Arrays.toString(sortedArray));
    }
}
