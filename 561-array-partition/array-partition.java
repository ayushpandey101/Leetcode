class Solution {
    public int arrayPairSum(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int num: nums) {
                if(min > num) min = num;
                if(max < num) max = num;
            }
            int[] freq = new int[max - min + 1];
            for (int num: nums) {
                freq[num - min]++;
            }
            int sum = 0, rem = 1;
            for (int i = 0; i < freq.length; i++) {
                int num = freq[i];  
                sum += ((num + rem) >> 1) * (i + min);
                rem ^= num & 1;
            }
        return sum;
    }
}