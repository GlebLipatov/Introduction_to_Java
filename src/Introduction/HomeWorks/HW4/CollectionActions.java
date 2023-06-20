package Introduction.HomeWorks.HW4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CollectionActions {
    Random rnd = new Random();

    public LinkedList<Integer> fill(LinkedList<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(10));
        }
        return list;
    }

    public void print(List list, String message) {
        System.out.println(message);
        System.out.println(list);
    }

    public void print(String word, String message) {
        System.out.println(message);
        System.out.println(word);
    }

    public void print(Integer[] array, String message) {
        System.out.println(message);
        if (array != null && array.length > 0) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        } else System.out.println("Stack is empty");
    }

    public void print(boolean value, String message) {
        System.out.println(message + ": " + value);
    }

    public void print(Integer value, String message) {
        System.out.println(message + ": " + value);
    }
}
