import java.util.Arrays;
import java.util.List;

public class CheckPrimeNumber {
    boolean isPrime(int num){
        if(num<=1){
            return false;
        }else{
            for(int i = 2; i < num; i++){
                if(num%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    void display(){
        System.out.println("Checking the git pull request");
    }


    public void  checkPrime(){
        List<Integer> list = Arrays.asList(1,2,3,45,7,9,11);
        boolean check = list.stream().anyMatch(this::isPrime);
        System.out.println("List contains prime numbers: "+check);
    }

    public static void main(String[] args) {
        CheckPrimeNumber cp = new CheckPrimeNumber();
        cp.checkPrime();
    }
}
