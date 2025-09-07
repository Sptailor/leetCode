
public class snakeCase {

    public static String toSnakeCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Handle camelCase (insert underscores before uppercase letters)
        String snake = input.replaceAll("([a-z])([A-Z])", "$1_$2");

        // Replace spaces or hyphens with underscores
        snake = snake.replaceAll("[\\s-]+", "_");

        // Convert to lowercase
        return snake.toLowerCase();
    }
}
