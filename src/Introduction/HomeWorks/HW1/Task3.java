package Introduction.HomeWorks.HW1;

import java.util.Scanner;

public class Task3 {
    static Scanner  scanner = new Scanner(System.in);
    private static String message = "3. Реализовать простой калькулятор";
    private static String enterFirstNumber = "Enter a first number: ";
    private static String enterSecondNumber = "Enter a second number: ";
    private static String enterAction = "Enter action(+-*/): ";
    private static String enterNotZero = "Enter something number above zero: ";

    private static String menuExit = "1 - Continue.\n0 - Exit.";
    private static String menuExitValidMessage = "Enter only 1 or 0: ";


    public static void start() {
        System.out.println("\n" + message);


        boolean isFinish = true;
        while (isFinish) {
            Double result = solution(inputNumber(enterFirstNumber), action(enterAction), inputNumber(enterSecondNumber));
            System.out.println("Result: " + result + "\n");
            isFinish = exit();
        }
    }

    private static Double solution(Double firstNumber, Character action, Double secondNumber) {
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

    private static Double inputNumber(String message) {
        do {
            System.out.printf("%s", message);
            String input = scanner.nextLine();
            if (isNumber(input)) return Double.parseDouble(input);
        } while (true);
    }



    private static Character action(String message) {
        while (true) {
            System.out.printf("%s", message);
            String action = scanner.nextLine();
            if (isAction(action)) return action.charAt(0);
        }
    }

    private static Boolean isAction(String action) {
        String actions = "+-*/";
        if (action.length() == 1 && actions.contains(action)) return true;
        return false;
    }

    private static boolean isNumber(String number) {
        if (number.isEmpty()) {
            return false;
        } else {
            try {
                Double.parseDouble(number);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    private static boolean exit() {
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
