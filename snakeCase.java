
// By Suhail Tailor
// This program converts a given string into snake_case format.

public class snakeCase {

   public static String toSnakeCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // If uppercase, add underscore before (if not first char)
            if (Character.isUpperCase(c)) {
                if (i > 0) {
                    result.append('_');
                }
                result.append(Character.toLowerCase(c));
            }
            // If space or non-letter/digit, replace with underscore
            else if (!Character.isLetterOrDigit(c)) {
                result.append('_');
            }
            else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
