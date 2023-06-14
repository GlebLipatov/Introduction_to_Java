package Introduction.HomeWorks.HW3;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {

    public static void solution() {
        System.out.println("1. Пусть дан произвольный список целых чисел, удалить из него четные числа");

        ArrayList<Integer> numbers = GetList.getList(10);
        printList("Input list", numbers);
        numbers = removeEvenNumbers(numbers);
        printList("Output list", numbers);
    }

    private static ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
        return numbers;
    }

    private static void printList(String message, ArrayList<Integer> list) {
        System.out.println(message);
        System.out.println(list + "\n");
    }






}
