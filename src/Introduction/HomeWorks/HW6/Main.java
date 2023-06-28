package Introduction.HomeWorks.HW6;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        NotebookBuilder notebookBuilder = new NotebookBuilder();

        HashSet<Notebook> notebooks = notebookBuilder.buildNotebooks(3);
        Notebook notebook1 = notebookBuilder.buildNotebook();
        Notebook notebook2 = notebookBuilder.buildNotebook();
        notebooks.add(notebook1);

        for (var note : notebooks) {
            System.out.println(note.toString());
        }
        System.out.println("Сравниваем ноуты notebook1 и notebook2: " + notebook1.equals(notebook2));
        System.out.println("Проверяем наличие ноута который создавали сами и добавили в сет: " + notebooks.contains(notebook1));
        System.out.println("Проверяем наличие ноута который создавали сами и не добавили в сет: " + notebooks.contains(notebook2));


    }
}
