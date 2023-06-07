package Introduction.HomeWorks.HW1;

import java.util.Scanner;

public class Task3 {
    Scanner scanner = new Scanner(System.in);
    private String message = "3. Реализовать простой калькулятор";
    private String enterFirstNumber = "Enter a first number: ";
    private String enterSecondNumber = "Enter a second number: ";
    private String enterAction = "Enter action(+-*/): ";
    private String enterNotZero = "Enter something number above zero: ";

    private String menuExit = "1 - Continue.\n0 - Exit.";
    private String menuExitValidMessage = "Enter only 1 or 0: ";


    public void start() {
        System.out.println("\n" + message);


        boolean isFinish = true;
        while (isFinish) {
            Double result = solution(inputNumber(enterFirstNumber), action(enterAction), inputNumber(enterSecondNumber));
            System.out.println("Result: " + result + "\n");
            isFinish = exit();
        }
    }

    private Double solution(Double firstNumber, Character action, Double secondNumber) {
        switch (action) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                if (secondNumber == 0) {
                    while (true) {
                        Double inputFromUser = inputNumber(enterNotZero);
                        if (inputFromUser != 0) {
                            return firstNumber / inputFromUser;
                        }
                    }
                }
                return firstNumber / secondNumber;
            default:
                return 0.0;
        }
    }

    private Double inputNumber(String message) {
        do {
            System.out.printf("%s", message);
            String input = scanner.nextLine();
            if (isNumber(input)) return Double.parseDouble(input);
        } while (true);
    }



    private Character action(String message) {
        while (true) {
            System.out.printf("%s", message);
            String action = scanner.nextLine();
            if (isAction(action)) return action.charAt(0);
        }
    }

    private Boolean isAction(String action) {
        String actions = "+-*/";
        if (action.length() == 1 && actions.contains(action)) return true;
        return false;
    }

    private boolean isNumber(String number) {
        if (number.isEmpty()) {
            return false;
        } else {
            try {
                Double num = Double.parseDouble(number);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    private boolean exit() {
        System.out.println(menuExit);
        while (true) {
            String inputFromUser = scanner.nextLine();
            if (isNumber(inputFromUser)) {
                int choice = Integer.parseInt(inputFromUser);
                if (choice == 1) return true;
                else if (choice == 0) return false;
            }
            System.out.println(menuExitValidMessage);
        }
    }
}
