package Introduction.HomeWorks.HW1;

public class Task1 {
    public void solution(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result += i;
        }
        System.out.printf("Сумма числе ровна: ", result);
    }
}
