import java.util.Scanner;

public class PasswordValidator {

    // Method to check password validity
    public static boolean isValidPassword(String password) {
        boolean hasUppercase = false;
        boolean hasDigit = false;

        // Check length
        if (password.length() < 8) {
            System.out.println("Password is too short. Minimum 8 characters required.");
            return false;
        }

        // Loop through each character
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Feedback messages
        if (!hasUppercase) {
            System.out.println("Password must contain at least one uppercase letter.");
        }

        if (!hasDigit) {
            System.out.println("Password must contain at least one digit.");
        }

        // Final validation
        return hasUppercase && hasDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        // Retry mechanism using while loop
        while (true) {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Password is valid and accepted.");
                break;
            } else {
                System.out.println("Please try again.\n");
            }
        }

        scanner.close();
    }
}