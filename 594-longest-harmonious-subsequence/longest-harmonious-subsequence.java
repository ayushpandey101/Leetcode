class Solution {
    public int findLHS(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (final int num : nums)
            cnt.merge(num, 1, Integer::sum);

        for (final int num : cnt.keySet())
            if (cnt.containsKey(num + 1))
                ans = Math.max(ans, cnt.get(num) + cnt.get(num + 1));

        return ans;
    }
}