class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            largest = Math.max(largest,nums[i]);
        }

        int arr[] = new int[largest+1];
        for(int i =0; i<nums.length; i++){
            arr[nums[i]]++;
        }

        int min = -1;
        int cnt = 0;
        for(int i = 0; i <= largest; i++){
            if(arr[i]>0){
                if(min == -1){
                    min = i;
                }
                while(arr[i]>0){
                    if(i - min >k){
                        cnt ++;
                        min = i;
                    }
                    arr[i]--;
                }
            }
        }
        return cnt+1;
    }
}