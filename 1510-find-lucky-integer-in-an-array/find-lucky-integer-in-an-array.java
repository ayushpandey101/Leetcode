import java.util.HashMap;
import java.util.Map; // Import Map interface

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Populate the frequency map
        for(int num : arr){ // Use 'num' for clarity instead of 'i'
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxLucky = -1; // Initialize with -1 as per problem statement for no lucky number

        // Iterate through the frequency map to find lucky numbers
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int number = entry.getKey();
            int frequency = entry.getValue();

            if(number == frequency){
                // This is a lucky number
                if(number > maxLucky){
                    maxLucky = number; // Update maxLucky if current lucky number is larger
                }
            }
        }
        return maxLucky;
    }
}