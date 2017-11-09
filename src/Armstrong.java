import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong {

    public static ArrayList<Integer> convertIntToArray(int input) {
        ArrayList<Integer> array = new ArrayList<>();
        do {
            array.add(input % 10);
            input /= 10;
        }
        while (input > 0);

        return array;
    }

    public static void isArmNum() {
        System.out.println("Please enter a number. ");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> array = convertIntToArray(input);

        int num = 0;
        for (int n = 0; n < array.size(); n++) {
            num += Math.pow(array.get(n), array.size());
            System.out.println(num);
        }
        System.out.println(input == num);
    }
}
