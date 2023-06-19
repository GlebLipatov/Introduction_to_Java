package Introduction.HomeWorks.HW4.Java;

import java.util.LinkedList;
import java.util.Random;

public class ListActions {

    public LinkedList<Integer> fill(LinkedList<Integer> list, Integer size) {
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(10));
        }
        return list;
    }

    public void print(LinkedList<Integer> list, String message) {
        System.out.println(message);
        System.out.println(list);
    }
}
