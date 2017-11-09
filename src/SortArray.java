import java.util.Scanner;
import java.util.Random;

public class SortArray {

    static int[] array;
    static boolean success = false;

    public static void initArray(int arraySize) {
        Random rand = new Random();

        array = new int[arraySize];

        int num = 0;
        while(num<arraySize) {
            array[num] = rand.nextInt(100);
            num++;
        }
    }

    public static void printArrayOutput(int arraySize, int numberOfPrinting) {
        System.out.print("This: ");
        int num = 0;
        while(num<arraySize) {
            if(num<arraySize-1) {
                System.out.print(array[num] + ", ");
                num++;
            } else {
                System.out.print(array[num]);
                num++;
            }
        }
        if(numberOfPrinting==1) System.out.println(" is your first array.");
        else if(numberOfPrinting==2) System.out.println(" is your final array.");
    }

    public static boolean runCalc(int arraySize) {
        int amtCompleted = 0;
        success = true;

        while (amtCompleted < arraySize-1) {
                if (array[amtCompleted] > array[amtCompleted + 1]) {
                    int temp = array[amtCompleted];
                    array[amtCompleted] = array[amtCompleted + 1];
                    array[amtCompleted + 1] = temp;
                    success = false;
                } else if (array[amtCompleted] < array[amtCompleted + 1]) amtCompleted++;
                else if (array[amtCompleted] == array[amtCompleted + 1]) amtCompleted++;
        }

        if(success==false) runCalc(arraySize);

        return success;
    }

    public static void sortIntArray() {
        System.out.println("Please enter your array size.");
        Scanner scanner = new Scanner(System.in);
        int arraySize = Integer.parseInt(scanner.nextLine());
        initArray(arraySize);

        printArrayOutput(arraySize,1);

        //while(runCalc(arraySize)==false) {
        //    runCalc(arraySize);
        //}

        runCalc(arraySize);

        if(success=true) printArrayOutput(arraySize, 2);
    }
}
