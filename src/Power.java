import java.util.Scanner;

public class Power {

    public static void isPowerOf2() {
        System.out.println("Please enter the number.");
        Scanner scanner = new Scanner(System.in);
        int intInput = Integer.parseInt(scanner.nextLine());

        //Need to make this code work properly...
        if(intInput%2 == 0) {
            System.out.println(intInput + " is a power of 2!");
        } else {
            System.out.println(intInput + " is not a power of 2.");
        }
    }
}
