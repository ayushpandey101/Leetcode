class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] dp = new long[n + 1];
        dp[1] = 1;
        int MOD = 1_000_000_007;
        long share = 0;
        for (int t = 2; t <= n; t++) {
            if (t - delay > 0)
                share = (share + dp[t - delay] + MOD) % MOD;
            if (t - forget > 0)
                share = (share - dp[t - forget] + MOD) % MOD;
            dp[t] = share;
        }
        long know = 0;

        for (int i = n - forget + 1; i <= n; i++)
            know = (know + dp[i]) % MOD;

        return (int) know;
    }
}