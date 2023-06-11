package Introduction.HomeWorks.HW2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    private static String task = "1. Реализуйте алгоритм сортировки пузырьком числового массива, " +
            "\nрезультат после каждой итерации запишите в лог-файл.";

    private static int[] array = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
    private static boolean isSorted = true;
    public static void solution() {
        int temp;
        File file = new File("log.txt");
        try (FileWriter fw = new FileWriter(file)) {
            while (isSorted) {
                isSorted = false;
                for (int i = 1; i < array.length; i++) {
                    if (array[i - 1] > array[i]) {
                        isSorted = true;
                        temp = array[i - 1];
                        array[i - 1] = array[i];
                        array[i] = temp;
                    }
                }
                for (int n : array) {
                    fw.write(n + " ");
                }
                fw.write("\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
