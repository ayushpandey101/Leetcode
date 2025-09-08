class Solution {
    
    private boolean hasZero(int num) {
        return String.valueOf(num).contains("0");
    }

    public int[] getNoZeroIntegers(int n) {

        for (int i = 1; i < n; i++) {
            int j = n - i;

            if (!hasZero(i) && !hasZero(j)) {
                return new int[]{i, j};
            }
        }
        return new int[]{}; 
    }
}