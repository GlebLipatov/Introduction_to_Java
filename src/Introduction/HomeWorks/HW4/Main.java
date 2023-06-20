package Introduction.HomeWorks.HW4;

public class Main {
    public static void main(String[] args) {
        CollectionActions action = new CollectionActions();
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task4 stack = new Task4();

        task1.solution();
        task2.solution();
        action.print(stack.isEmpty(), "Check empty stack");
        action.print(stack.size(), "Check size of stack");

        System.out.println(stack.getTask());

        int one = 1;
        int two = 2;
        stack.push(one);
        action.print(stack.get(), "Push: " + one);
        stack.push(two);
        action.print(stack.get(), "Push: " + two);
        action.print(stack.isEmpty(), "Check empty stack");
        action.print(stack.size(), "Check size of stack");

        System.out.println();

        action.print(stack.peek(), "Check peek()");
        action.print(stack.size(), "Check size of stack");

        System.out.println();

        action.print(stack.get(), "Show stack before pop()");
        action.print(stack.pop(), "Check pop()");
        action.print(stack.size(), "Check size of stack");
        action.print(stack.get(), "Show stack after pop()");

        System.out.println();

        action.print(stack.get(), "Show stack before pop()");
        action.print(stack.pop(), "Check pop()");
        action.print(stack.size(), "Check size of stack");
        action.print(stack.get(), "Show stack after pop()");
    }
}
