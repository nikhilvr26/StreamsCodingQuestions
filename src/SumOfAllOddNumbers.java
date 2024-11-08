import java.util.List;

public class SumOfAllOddNumbers {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1,2,3,4,5,6,7,8,9);
       int sumOfOdd =  intList
               .stream()
               .filter(i->i%2==1)
               .mapToInt(Integer::intValue)
               .sum();
        System.out.println(sumOfOdd);
    }
}
