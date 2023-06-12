package Introduction.HomeWorks.HW1;

import Introduction.HomeWorks.HW2.DoLog;

import java.util.Scanner;

public class Task3 {

    private Scanner scanner = new Scanner(System.in);
    private String message = "3. Реализовать простой калькулятор";
    private String enterFirstNumber = "Enter a first number: ";
    private String enterSecondNumber = "Enter a second number: ";
    private String enterAction = "Enter action(+-*/): ";
    private String enterNotZero = "Enter something number above zero: ";

    private String menuExit = "1 - Continue.\n0 - Exit.";
    private String menuExitValidMessage = "Enter only 1 or 0: ";
    DoLog doLog;
    public Task3(Class classToLog) {
        this.doLog = new DoLog(classToLog);
    }


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
        String message;
        Double result;
        switch (action) {
            case '+':
                result = firstNumber + secondNumber;
                message = getMessage(firstNumber, action, secondNumber, result);
                doLog.logging(message);
                return result;
            case '-':
                result = firstNumber - secondNumber;
                message = getMessage(firstNumber, action, secondNumber, result);
                doLog.logging(message);
                return result;
            case '*':
                result = firstNumber * secondNumber;
                message = getMessage(firstNumber, action, secondNumber, result);
                doLog.logging(message);
                return result;
            case '/':
                while (secondNumber == 0) {
                    secondNumber = inputNumber(enterNotZero);
                }

                result = firstNumber / secondNumber;
                message = getMessage(firstNumber, action, secondNumber, result);
                doLog.logging(message);
                return result;
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
                Double.parseDouble(number);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    private String getMessage(Double firstNumber, Character action, Double secondNumber, Double result) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nFirstNumber=").append("'").append(firstNumber).append("'\n");
        sb.append("Action=").append("'").append(action).append("'\n");
        sb.append("SecontNumber=").append("'").append(secondNumber).append("'\n");
        sb.append("Result=").append("'").append(result).append("'\n");
        return sb.toString();
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
