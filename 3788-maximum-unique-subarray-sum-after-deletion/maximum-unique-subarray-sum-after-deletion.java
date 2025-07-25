class Solution {
    public int maxSum(int[] nums) {
        int cnt=0;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> num = new HashSet<>();
        for (int i = 0; i<nums.length ; i++){
            if(nums[i]>0){
                num.add(nums[i]);
            }
            else{
                max=Math.max(max,nums[i]);
            }
        }
        if(num.isEmpty()){
            return max;
        }
        for(int i : num){
            cnt+=i;
        }
    return cnt;
    }
}