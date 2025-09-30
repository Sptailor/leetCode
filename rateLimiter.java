import java.util.HashMap;
import java.util.Map;

public class rateLimiter {

    private final int limit;        // max requests allowed
    private final int windowSize;   // window size in seconds

    // Store request info per user
    private static class UserRequestInfo {
        int count;
        int windowStart;
    }

    private final Map<Integer, UserRequestInfo> userRequests = new HashMap<>();

    public rateLimiter(int limit, int windowSize) {
        this.limit = limit;
        this.windowSize = windowSize;
    }

    public synchronized boolean isAllowed(int userId, int timestamp) {
        UserRequestInfo info = userRequests.get(userId);

        if (info == null) {
            // First request from this user
            info = new UserRequestInfo();
            info.count = 1;
            info.windowStart = timestamp;
            userRequests.put(userId, info);
            return true;
        }

        // Check if we are still in the same window
        if (timestamp < info.windowStart + windowSize) {
            if (info.count < limit) {
                info.count++;
                return true;
            } else {
                return false; // limit exceeded
            }
        } else {
            // Window has expired, reset counter
            info.count = 1;
            info.windowStart = timestamp;
            return true;
        }
    }
}
