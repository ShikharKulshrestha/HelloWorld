import java.util.*;

public class SocialMedia {

    // Analyze username mentions or interactions
    public static void analyzeUsernames(String[] usernames) {

        HashMap<String, Integer> userCounts = new HashMap<>();

        // Count frequency of each username
        for (String user : usernames) {
            userCounts.put(user, userCounts.getOrDefault(user, 0) + 1);
        }

        // Find most popular username
        int maxCount = 0;
        for (int count : userCounts.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println("Username Popularity Report:");
        userCounts.forEach((user, count) ->
                System.out.println(user + ": " + count + " mentions")
        );

        // Handle ties (multiple most popular users)
        System.out.println("\nMost Popular Username(s):");
        for (Map.Entry<String, Integer> entry : userCounts.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println(entry.getKey() +
                        " (" + maxCount + " mentions)");
            }
        }
    }

    public static void main(String[] args) {

        // Example social media mentions or likes
        String[] interactions = {
                "alice", "bob", "alice", "charlie",
                "bob", "alice", "david", "bob", "alice"
        };

        analyzeUsernames(interactions);
    }
}
