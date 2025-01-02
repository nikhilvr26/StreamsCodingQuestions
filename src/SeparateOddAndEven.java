import java.util.Arrays;
import java.util.List;

public class SeparateOddAndEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> oddList = list
                .stream()
                .filter(x -> x%2 == 1)
                .toList();
        System.out.println("Odd List : " + oddList);
        List<Integer> evenList = list
                .stream()
                .filter(a-> a%2 == 0)
                .toList();
        System.out.println("Even List : "+ evenList);
    }
}
