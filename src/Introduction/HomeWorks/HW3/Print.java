package Introduction.HomeWorks.HW3;

import java.util.ArrayList;

public class Print {
    public static void printList(String message, ArrayList<Integer> list) {
        System.out.println(message);
        System.out.println(list + "\n");
    }

    public static void printArray(String message, int[] array) {
        System.out.println(message);
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void printInteger(String message, Integer number) {
        System.out.println(message + number);
    }
}
