public class Solution {

    public long kMirror(int k, int n) {
        long sum = 0;
        int count = 0;

        // Start with 1-digit palindromes and increase digit length
        int length = 1;
        while (count < n) {
            // Generate all base-10 palindromes of current length
            for (long pal : generatePalindromes(length)) {
                if (isPalindrome(toBaseK(pal, k))) {
                    sum += pal;
                    count++;
                    if (count == n)
                        return sum;
                }
            }
            length++;
        }

        return sum;
    }

    // Generate all base-10 palindromes of a specific digit length
    private List<Long> generatePalindromes(int length) {
        List<Long> palindromes = new ArrayList<>();

        int half = (length + 1) / 2;
        long start = (length == 1) ? 1 : (long) Math.pow(10, half - 1);
        long end = (long) Math.pow(10, half);

        for (long i = start; i < end; i++) {
            String left = Long.toString(i);
            String right = new StringBuilder(left).reverse().toString();
            String pal = (length % 2 == 0) ? (left + right) : (left + right.substring(1));
            palindromes.add(Long.parseLong(pal));
        }

        return palindromes;
    }

    // Convert number to base-k string
    private String toBaseK(long num, int k) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % k);
            num /= k;
        }
        return sb.reverse().toString();
    }

    // Check if a string is a palindrome
    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }
}
