import java.util.Scanner;
import java.util.Random;

public class SortArray {

    static int[] array;

    public static void initArray(int arraySize) {
        Random rand = new Random();

        array = new int[arraySize];

        int num = 0;
        while(num<arraySize) {
            array[num] = rand.nextInt(100);
            num++;
        }
    }

    public static void printArrayOutput(int arraySize) {
        //System.out.println("This "+array[0]+", "+array[1]+", "+array[2]+", "+ array[3]+", "+array[4]+
          //      ", "+ array[5]+", "+array[6]+" is your array.");
        System.out.println("This ");
        int num = 0;
        while(num<arraySize) {
            System.out.print(array[num]+", ");
            num++;
        }
        System.out.println(" is your array.");
    }

    public static void sortIntArray() {
        System.out.println("Please enter your array size.");
        Scanner scanner = new Scanner(System.in);
        int arraySize = Integer.parseInt(scanner.nextLine());
        initArray(arraySize);

        printArrayOutput(arraySize);

        int amtCompleted = 0;

        boolean success = false;

        while(success = false) {
            success = true;
            while (amtCompleted < arraySize) {
                if (array[amtCompleted] > array[amtCompleted + 1]) {
                    int temp = array[amtCompleted];
                    array[amtCompleted] = array[amtCompleted + 1];
                    array[amtCompleted + 1] = temp;
                    success = false;
                }
                else if (array[amtCompleted] < array[amtCompleted + 1])
                {
                    amtCompleted++;
                }
                else if (array[amtCompleted] == array[amtCompleted + 1]) amtCompleted++;
            }
            amtCompleted = 0;
        }
        if(success=true) printArrayOutput(arraySize);
    }
}
