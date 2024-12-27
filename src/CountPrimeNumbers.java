import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountPrimeNumbers {
    boolean isPrime(int num){
        if(num<=1){
            return false;
        }else {
            for(int i = 2; i<num; i++){
                if(num%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public void filterPrime() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,9,11);
        List<Integer> listOfPrimeNumber = list
                .stream()
                .filter(this::isPrime)
                .collect(Collectors.toList());
        System.out.println(listOfPrimeNumber);
    }

    public static void main(String[] args) {
        CountPrimeNumbers count = new CountPrimeNumbers();
        count.filterPrime();
    }
}
