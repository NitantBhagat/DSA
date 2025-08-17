class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k + maxPts - 1) return 1.0; // early exit

        int size = k + maxPts;           // we only need up to k+maxPts-1
        double[] f = new double[size];

        // Base region: when we stop drawing (score >= k)
        for (int x = k; x < size; x++) {
            f[x] = (x <= n) ? 1.0 : 0.0;
        }

        // Initialize window sum = f[k] + ... + f[k+maxPts-1]
        double window = 0.0;
        for (int x = k; x < k + maxPts; x++) window += f[x];

        // Fill backwards for x = k-1 .. 0
        for (int x = k - 1; x >= 0; x--) {
            f[x] = window / maxPts;
            window += f[x] - f[x + maxPts];  // slide the window left by 1
        }

        return f[0];
    }
}
