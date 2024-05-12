import java.util.Scanner;

public class PasswordChecker {
    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        System.out.println("My name is Mustafa");
        try (Scanner scanner = new Scanner(System.in)) {
            int attemptCount = 1;
            do {
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();
                if (isValidPassword(password)) {
                    System.out.println("You are Crack Me !!!");
                    break;
                } else {
                    System.out.println("Your input is invalid.");
                    if (attemptCount == MAX_ATTEMPTS) {
                        System.out.println("The number of attempts has expired.");
                        break;
                    }
                }
                attemptCount++;
            } while (attemptCount <= MAX_ATTEMPTS);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static boolean isValidPassword(String password) {
        // TO DO: implement a more secure password validation mechanism
        return password.equals("Mustafa");
    }
}
