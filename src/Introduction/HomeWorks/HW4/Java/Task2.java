package Introduction.HomeWorks.HW4.Java;

import java.util.LinkedList;

public class Task2 {
    public void solution() {
        CollectionActions action = new CollectionActions();
        String task = "2. Реализуйте очередь с помощью LinkedList со следующими методами: \n" +
                "enqueue() - помещает элемент в конец очереди,\n" +
                "dequeue() - возвращает первый элемент из очереди и удаляет его,\n" +
                "first() - возвращает первый элемент из очереди, не удаляя.";
        LinkedList<String> words = new LinkedList<>();

        System.out.println("\n" + task);

        words.add("First");
        words.add("Second");
        action.print(words, "\nBefore:");

        enqueue(words,"Last");
        action.print(words, "\nInput element in the end:");

        action.print(dequeue(words), "\nReturn first element: ");
        action.print(words, "And remmove it: ");

        action.print(first(words), "\nReturn first element");
        action.print(words, "And save it: ");


    }
    private void enqueue(LinkedList<String> words, String word) {
        words.addLast(word);
    }
    private String dequeue(LinkedList<String> words) {
        return words.pollFirst();
    }
    private String first(LinkedList<String> words) {
        return words.getFirst();
    }
}
