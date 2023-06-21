package Introduction.HomeWorks.HW5;

import java.util.*;

public class Task1 {
    private HashMap<String, List<Integer>> phoneBook = new HashMap<>();
    private String task = "1. Реализуйте структуру телефонной книги с помощью HashMap. " +
            "\nПрограмма также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, " +
            "\nих необходимо считать, как одного человека с разными телефонами. " +
            "\nВывод должен быть отсортирован по убыванию числа телефонов." +
            "\n(можно выводить без сортировки, но обязательно в отдельном методе)\n";

    public void solution() {
        System.out.println(task);

        add("Ivanov", 123);
        add("Ivanov", 321);
        add("Ivanov", 111);

        add("Petrov", 456);
        add("Petrov", 654);

        add("Sidorov", 789);

        add("Pupkina", 123456);
        add("Pupkina", 654321);
        add("Pupkina", 222222);

        TreeMap<String, String> sortedPhoneBook = sort();
        printAll(sortedPhoneBook);
    }

    /**
     * Added new person or new number for person to the phone book.
     *
     * @param name   String
     * @param number Integer
     */
    private void add(String name, Integer number) {
        if (this.phoneBook.containsKey(name)) {
            phoneBook.get(name).add(number);
        } else {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(number);
            phoneBook.put(name, numbers);
        }
    }

    /**
     * Print Phone Book
     */
    private void printAll(TreeMap<String, String> phoneBook) {
        for (var person : phoneBook.entrySet()) {
            System.out.printf("Person: %s | numbers: %s\n", person.getValue(), person.getKey());
        }
    }

    /**
     * Sorted phone book and convert to TreeMap<String, String> for print.
     * @return TreeMap<String, String>
     */
    private TreeMap<String, String> sort() {
        TreeMap<String, String> temp = new TreeMap<>();
        /*
        Конвертируем исходный HashMap<String, List<Integer>> в TreeMap<String, String>
        при чем меняем местами ключ и значение

        По мне так это варварство, но по другому я чет не понял как =((((
        */
        for (var person : this.phoneBook.entrySet()) {
            String numbers = String.join(",", person.getValue().toString());
            temp.put(numbers, person.getKey());
        }

        TreeMap<String, String> sorted = new TreeMap<>(
                new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        return Integer.compare(s1.length(), s2.length());
                    }
                }
        );
        sorted.putAll(temp);
        return sorted;
    }
}
