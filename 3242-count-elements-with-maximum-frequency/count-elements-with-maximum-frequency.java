class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }
        int totalFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency == maxFrequency) {
                totalFrequency += frequency; 
            }
        }
        return totalFrequency;
    }
}