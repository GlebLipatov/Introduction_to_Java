package Introduction.HomeWorks.HW1;

public class Task2 {

    static private String message = "2. Вывести все простые числа от 1 до 1000";

    public static void solution(int number) {
        System.out.println(message);

        boolean isSimple;

        for (int i = 1; i <= number; i++) {
            if (i < 3 || i % 2 != 0) {
                isSimple = true;
                for (int j = 2; j < i / 2 + i % 2; j++) {
                    if (i % j == 0) {
                        isSimple = false;
                        break;
                    }
                }
                if (isSimple) System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
