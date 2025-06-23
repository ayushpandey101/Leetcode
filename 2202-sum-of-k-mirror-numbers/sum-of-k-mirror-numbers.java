public class Solution {
    
    public long kMirror(int k, int n) {
        long sum = 0;
        int count = 0;
        int length = 1;

        while (count < n) {
            // Generate all palindromes of a given length
            for (long i = (long)Math.pow(10, (length - 1) / 2); count < n && i < Math.pow(10, (length + 1) / 2); i++) {
                String left = Long.toString(i);
                String right = new StringBuilder(left).reverse().toString();
                String full = (length % 2 == 0) ? (left + right) : (left + right.substring(1));

                long num = Long.parseLong(full);
                if (isPalindrome(Long.toString(num, k))) {
                    sum += num;
                    count++;
                }
            }
            length++;
        }

        return sum;
    }

    // Helper function to check if a string is a palindrome
    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}
