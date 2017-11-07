//Java programming exercises, by David Ryan
//Link to resource: http://www.java67.com/2013/01/10-programming-questions-and-exercises.html

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter the number for your function. ");
        Scanner scanner = new Scanner(System.in);
        int firstOption = Integer.parseInt(scanner.nextLine());

        if(firstOption==1) EvenOrOdd.evenOrOdd();
        else if(firstOption==2) Prime.prime();
        else if(firstOption==3) Palindrome.palindrome();
        else if(firstOption==4) Power.isPowerOf2();
    }
}
