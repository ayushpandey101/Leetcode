class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodArrays(int n, int m, int k) {
        long a = CountK(n - 1, n - 1 - k);  // C(n-1, n-1-k) % MOD
        long pow = modPow(m - 1, n - 1 - k); // (m-1)^(n-1-k) % MOD
        return (int) (((1L * m % MOD) * a % MOD) * pow % MOD); // final result % MOD
    }

    static long CountK(int n, int k) {
        // C(n, k) = fact(n) / (fact(k) * fact(n-k)) % MOD
        long numerator = fact(n);
        long denominator = (fact(k) * fact(n - k)) % MOD;
        return (numerator * modInverse(denominator)) % MOD;
    }

    static long fact(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res = (res * i) % MOD;
        }
        return res;
    }

    static long modPow(long base, int exp) {
        long result = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }

    static long modInverse(long a) {
        // Using Fermat’s little theorem: a^(MOD - 2) ≡ a^(-1) (mod MOD)
        return modPow(a, MOD - 2);
    }
}
