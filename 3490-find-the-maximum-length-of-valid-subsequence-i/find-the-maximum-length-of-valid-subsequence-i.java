import java.util.Arrays;

class Solution {
  public int maximumLength(int[] nums) {
    // dp[i][j] := max length of valid subsequence where last num % 2 == i
    // and next desired num % 2 == j
    int[][] dp = new int[2][2];

    for (final int x : nums)
      for (int y = 0; y < 2; ++y)
        dp[x % 2][y] = Math.max(dp[x % 2][y], dp[y][x % 2] + 1);

    return Arrays.stream(dp).flatMapToInt(Arrays::stream).max().getAsInt();
  }
}
