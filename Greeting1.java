import java.util.Scanner;

public class Greeting1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Hello, " + name + "! Welcome to Java ");
        }
    }
}