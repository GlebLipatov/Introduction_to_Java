package Introduction.HomeWorks.HW3;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {

    public static void solution() {
        System.out.println("2. Пусть дан произвольный список целых чисел, удалить из него четные числа.");

        ArrayList<Integer> numbers = GetList.getList(10);
        Print.printList("Input list", numbers);
        numbers = removeEvenNumbers(numbers);
        Print.printList("Output list", numbers);
    }

    private static ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }








}
