package Introduction.HomeWorks.HW6;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        NotebookBuilder notebookBuilder = new NotebookBuilder();
        notebookBuilder.init();

        HashSet<Notebook> notebooks = notebookBuilder.buildNotebooks(3);
        Notebook notebook = notebookBuilder.buildNotebook();
        notebooks.add(notebook);

        for (var note : notebooks) {
            System.out.println(note.toString());
        }

        System.out.println("Проверяем наличие ноута который создавали сами и добавили в сет: " + notebooks.contains(notebook));
        System.out.println("Проверяем наличие ноута который создавали сами и не добавили в сет: " + notebooks.contains(notebookBuilder.buildNotebook()));


    }
}
