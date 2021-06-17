//Java programming exercises
//Link to resource: http://www.java67.com/2013/01/10-programming-questions-and-exercises.html

import java.util.Scanner;

public class Main {

    public static void printAllOptions() {
        System.out.println("1. Even or Odd");
        System.out.println("2. Prime Numbers");
        System.out.println("3. Palindromes");
        System.out.println("4. Power of 2");
        System.out.println("5. Sort Integer Arrays");
        System.out.println("6. Armstrong Numbers");
    }

    public static void main(String[] args) {
        System.out.println("Please enter the number for your function. Options are: ");
        printAllOptions();

        Scanner scanner = new Scanner(System.in);
        int firstOption = Integer.parseInt(scanner.nextLine());

        if(firstOption==1) EvenOrOdd.evenOrOdd();
        else if(firstOption==2) Prime.prime();
        else if(firstOption==3) Palindrome.palindrome();
        else if(firstOption==4) Power.isPowerOf2();
        else if(firstOption==5) SortArray.sortIntArray();
        else if(firstOption==6) Armstrong.isArmNum();
    }
}
