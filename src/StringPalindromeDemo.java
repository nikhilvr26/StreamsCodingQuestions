import java.util.stream.IntStream;

public class StringPalindromeDemo {
    public static void main(String[] args) {
        String original = "racecar";
        boolean isPalindrome = IntStream
                .range(0, original.length()/2)
                .allMatch(i -> original.charAt(i) == original.charAt(original.length()-1-i));
        if(isPalindrome){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
