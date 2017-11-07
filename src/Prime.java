import java.util.Scanner;

public class Prime {

    public static void prime() {
        System.out.println("Please enter the number.");
        Scanner scanner = new Scanner(System.in);
        int integerInput = Integer.parseInt(scanner.nextLine());
        if (isNumPrime(integerInput) == true) {
            System.out.println(integerInput + " is a prime number!");
        } else {
            System.out.println(integerInput + " is not a prime number.");
        }
    }

    private static boolean isNumPrime(int intIn) {
        int numOfDiv = 2;
        while (numOfDiv < intIn) {
            if (intIn%numOfDiv==0) {
                return false;
            } else {
                numOfDiv = numOfDiv + 1;
            }
        }
        return true;
    }
}
