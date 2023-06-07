package Introduction.HomeWorks.HW1;

public class Task1 {

    private String message = "1. Вычислить сумму чисел от 1 до n";


    public void solution(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result += i;
        }
        System.out.printf("%s\nСумма числе ровна: %d\n\n", message, result);
    }
}
