import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringTransportationCost {

    public static int calculateCost(String str1, String str2) {
        // Calculate transportation cost between two strings
        if (str1.equals(str2)) return 0;
        int cost = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                cost++;
            }
        }
        return cost;
    }

    public static int sendStrings(List<String> strings) {

        int totalCost = 0;
        List<String> sentStrings = new ArrayList<>();

        for (String currentString : strings) {
            int minCost = currentString.length();  // Initialize with cost per bit
            for (String sentString : sentStrings) {
                int cost = 0;
                if (!currentString.equals(sentString))
                    cost = calculateCost(currentString, sentString);
                minCost = Math.min(minCost, cost);
            }
            totalCost += minCost;
            sentStrings.add(currentString);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
//        strings.add("1001");
//        strings.add("1110");

        strings.add("0111");
        strings.add("0101");
        strings.add("1000");
        // Add more strings as needed

        int minTransportCost = sendStrings(strings);
        System.out.println("Minimum transportation cost: " + minTransportCost);
    }
}