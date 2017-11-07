import java.util.Scanner;

public class EvenOrOdd {

    public static void evenOrOdd() {
        System.out.println("Please enter the number.");

        //Get user input
        Scanner scanner = new Scanner(System.in);
        double userInt = Integer.parseInt(scanner.nextLine());
        double userIntDouble = userInt / 2;

        //Print results
        if ((int)userIntDouble == userIntDouble) {
            System.out.println((int)userInt + " is an even number.");
        } else {
            System.out.println((int)userInt + " is an odd number.");
        }
    }
}
