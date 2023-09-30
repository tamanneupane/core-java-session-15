import java.util.Arrays;

public class MinTransportationCost {

    public static int minCost(String[] strings) {
        int n = strings.length;
        int m = strings[0].length();

        // dp[i][j] represents the minimum cost to transfer i strings up to the jth string.
        int[][] dp = new int[n + 1][n + 1];

        // Initialize dp array with maximum possible cost
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        // Base case: No cost for transferring 0 strings.
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Calculate cost if we transfer the current string by paying 1 unit per bit.
                int cost1 = dp[i - 1][j - 1] + countOnes(strings[i - 1]);

                // Calculate cost if we transfer the current string by paying based on unequal bits with previous strings.
                int cost2 = dp[i - 1][j] + countUnequalBits(strings[i - 1], strings[j - 1]);

                // Choose the minimum cost between the two options.
                dp[i][j] = Math.min(cost1, cost2);
            }
        }

        // Find the minimum cost to transfer all strings.
        int minCost = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            minCost = Math.min(minCost, dp[n][i]);
        }

        return minCost;
    }

    // Helper function to count the number of '1's in a string.
    private static int countOnes(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    // Helper function to count the number of unequal bits between two strings.
    private static int countUnequalBits(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] strings = {"011", "011", "100"};
        int minCost = minCost(strings);
        System.out.println("Minimum transportation cost: " + minCost);
    }
}
