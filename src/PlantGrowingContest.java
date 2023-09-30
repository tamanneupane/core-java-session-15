import java.util.Arrays;

public class PlantGrowingContest {
    public static int plantGrowingContest(int N, int K, int W, int S, int[] A) {
        int[] minTimeWithoutSprinkler = new int[N + 1];
        int[] minTimeWithSprinkler = new int[N + 1];

        // Initialize arrays with large values
        Arrays.fill(minTimeWithoutSprinkler, Integer.MAX_VALUE);
        Arrays.fill(minTimeWithSprinkler, Integer.MAX_VALUE);

        // Base case: It takes 0 time to water 0 plants
        minTimeWithoutSprinkler[0] = 0;
        minTimeWithSprinkler[0] = 0;

        for (int i = 1; i <= N; i++) {
            // Calculate the time to water the current plant individually
            minTimeWithoutSprinkler[i] = minTimeWithoutSprinkler[i - 1] + A[i - 1];

            // Calculate the time to water the current plant with a sprinkler
            minTimeWithSprinkler[i] = minTimeWithoutSprinkler[i - 1] + W;

            // Consider the case of watering a subarray with the sprinkler
            if (i >= K) {
                minTimeWithSprinkler[i] = Math.min(minTimeWithSprinkler[i], minTimeWithSprinkler[i - K] + S);
            }
        }

        // The minimum time to water all plants is the minimum of the last two states
        return Math.min(minTimeWithoutSprinkler[N], minTimeWithSprinkler[N]);
    }

    public static void main(String[] args) {
        int N = 5;
        int K = 3;
        int W = 5;
        int S = 2;
        int[] A = {1, 4, 8, 4, 1};

        int result = plantGrowingContest(N, K, W, S, A);
        System.out.println(result); // Output: 7
    }

}

