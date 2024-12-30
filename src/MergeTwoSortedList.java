import java.util.List;
import java.util.stream.Stream;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,3,5,7,9,17,13);
        List<Integer> list2 = List.of(2,4,6,8,10,2);
        List<Integer> mergedList = Stream
                .concat(list1.stream(), list2.stream())
                .sorted()
                .toList();
        System.out.println(mergedList);
    }
}
