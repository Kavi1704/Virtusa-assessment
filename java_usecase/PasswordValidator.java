import java.util.Scanner;

public class PasswordValidator {


    public static boolean isValidPassword(String password) {
        boolean hasUppercase = false;
        boolean hasDigit = false;

        
        if (password.length() < 8) {
            System.out.println("Password is too short. Minimum 8 characters required.");
            return false;
        }

        
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        
        if (!hasUppercase) {
            System.out.println("Password must contain at least one uppercase letter.");
        }

        if (!hasDigit) {
            System.out.println("Password must contain at least one digit.");
        }

        
        return hasUppercase && hasDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        
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
