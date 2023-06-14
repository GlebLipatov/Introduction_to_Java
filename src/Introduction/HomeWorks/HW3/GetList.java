package Introduction.HomeWorks.HW3;

import java.util.ArrayList;
import java.util.Random;

public class GetList {
    public static ArrayList<Integer> getList(int size) {
        ArrayList<Integer> list = new ArrayList<>(size);
        Random rnd = new Random();

        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(1,20));
        }

        return list;
    }
}
