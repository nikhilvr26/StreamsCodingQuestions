public class CheckStringAnagram {
    public static boolean areAnagrams(String s1, String s2) {
        // Handle null or empty strings
        if (s1 == null || s2 == null) {
            return false;
        }

        // Normalize strings: remove spaces and convert to lowercase
        String normalizedS1 = s1.replaceAll("\\s", "").toLowerCase();
        String normalizedS2 = s2.replaceAll("\\s", "").toLowerCase();

        // Anagrams must have the same length after normalization
        if (normalizedS1.length() != normalizedS2.length()) {
            return false;
        }

        // Use streams to sort the characters of each string
        String sortedS1 = normalizedS1.chars()
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();

        String sortedS2 = normalizedS2.chars()
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();

        // Compare the sorted strings
        return sortedS1.equals(sortedS2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.printf("'%s' and '%s' are anagrams? %s%n", str1, str2, areAnagrams(str1, str2));
    }
}
