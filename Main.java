import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Ask for the user's age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Print a message
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        input.close();
    }
}
