class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt=0;
        int index=-1;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                cnt+=i-index;
            }else{
                index=i;
            }
        }
        return cnt;
    }
}