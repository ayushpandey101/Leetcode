class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int sub = Math.abs(nums[0]-nums[nums.length - 1]);

        for(int i =0; i<nums.length-1; i++){
            sub = Math.max(sub, Math.abs(nums[i]-nums[i + 1]));
        }

        return sub;
}}