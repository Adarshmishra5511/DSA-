public class MinOperationsToZero {
    public static int minOperations(int n) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE; // Initialize to a large value
            int j = 1;
            while (j <= i) {
                if (j == i) {
                    dp[i] = 1; // A single operation to make i equal to 0
                } else if (j < i) {
                    int operations = 1 + dp[i - j];
                    dp[i] = Math.min(dp[i], operations);
                }
                j *= 2; // Double j to consider powers of 2
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 15;
        int result = minOperations(n);
        System.out.println("Minimum operations to make " + n + " equal to 0: " + result);
    }
}
