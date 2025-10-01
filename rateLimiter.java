import java.util.HashMap;
import java.util.Map;

public class rateLimiter {

    // Configuration
    private final int maxRequests;    // How many requests allowed per window
    private final int windowSeconds;  // Time window in seconds

    // Track each user's request count and when their window started
    private final Map<Integer, Integer> requestCount = new HashMap<>();
    private final Map<Integer, Integer> windowStartTime = new HashMap<>();

    public rateLimiter(int maxRequests, int windowSeconds) {
        this.maxRequests = maxRequests;
        this.windowSeconds = windowSeconds;
    }

    public synchronized boolean isAllowed(int userId, int currentTime) {
        // Step 1: Clean up old users whose windows have expired
        cleanupExpiredUsers(currentTime);

        // Step 2: Check if this is a new user
        if (!requestCount.containsKey(userId)) {
            requestCount.put(userId, 1);
            windowStartTime.put(userId, currentTime);
            return true;  // First request always allowed
        }

        // Step 3: Get user's current window info
        int userWindowStart = windowStartTime.get(userId);
        int userCount = requestCount.get(userId);

        // Step 4: Check if still in the same time window
        boolean inSameWindow = currentTime < userWindowStart + windowSeconds;

        if (inSameWindow) {
            // Still in same window - check if under limit
            if (userCount < maxRequests) {
                requestCount.put(userId, userCount + 1);
                return true;  // Request allowed
            } else {
                return false;  // Limit reached - reject request
            }
        } else {
            // Window expired - start a new window
            requestCount.put(userId, 1);
            windowStartTime.put(userId, currentTime);
            return true;  // Request allowed in new window
        }
    }

    private void cleanupExpiredUsers(int currentTime) {
        // Remove users whose windows have completely passed
        windowStartTime.entrySet().removeIf(entry ->
            currentTime >= entry.getValue() + windowSeconds
        );
        // Also remove their counts
        requestCount.keySet().retainAll(windowStartTime.keySet());
    }
}
