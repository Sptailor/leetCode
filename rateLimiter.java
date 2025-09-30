import java.util.HashMap;

public class rateLimiter {
    



    public boolean isAllowed(int userId, int timestamp, int limit) {
        // Check if the user has exceeded the rate limit
        if (getUserRequestCount(userId, timestamp) > limit) {
            return false;
        }
        return true;
    }
        // Dummy method to simulate getting the request count for a user
    private int getUserRequestCount(int userId, int timestamp) {
        HashMap<Integer, Integer> userRequestCounts = new HashMap<>();
        // In a real implementation, this would track requests over time
        if (userRequestCounts.containsKey(userId)) {
            return userRequestCounts.get(userId);
        }   
        return 0;
    }
    
}
