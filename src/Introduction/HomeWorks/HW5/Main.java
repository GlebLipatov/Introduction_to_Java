package Introduction.HomeWorks.HW5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
        Task3 task3 = new Task3();

//        task1.solution();
//        Task2.solution();

        ArrayList<Boolean[][]> fields = task3.solution();

        System.out.println(fields.size());

        for (var item : fields) {
            task3.print(item);
        }

    }
}
