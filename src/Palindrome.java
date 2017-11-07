import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

    public static void palindrome() {
        System.out.println("Please enter the number.");
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();

        char[] charArrayInput = stringInput.toCharArray();

        char[] charArrayInputReversed = new char[charArrayInput.length];

        int numCompleted = 0;
        while(numCompleted != charArrayInput.length)
        {
            charArrayInputReversed[charArrayInput.length-numCompleted-1]=charArrayInput[numCompleted];
            numCompleted++;
        }

//        boolean retval= Arrays.equals(charArrayInput, charArrayInputReversed);
//        System.out.println(retval);
        if(Arrays.equals(charArrayInput, charArrayInputReversed)) {
//            if(charArrayInput==charArrayInputReversed) {
            System.out.println(new String(charArrayInput) + " is a palindrome!");
        } else {
            System.out.println(new String(charArrayInput) + " is not a palindrome.");
        }
    }
}
