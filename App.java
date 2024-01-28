import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
	System.out.print("Jai Shri Ram!")
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print a greeting with the entered name
        System.out.println("Hello, " + name + "! Welcome to the DevOps Program.");

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
