package Introduction.HomeWorks.HW6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Shop {
    private HashMap<Long, Notebook> showcase;
    private Components components;

    public void init(){
        this.showcase = new HashMap<>();
        this.components = new Components();
    }
    public void add(HashSet<Notebook> notebooks) {
        for (Notebook note : notebooks) {
            if (!showcase.containsKey(note.getId())) {
                showcase.put(note.getId(), note);
            } else {
                System.out.println("Такой уже есть, оставь себе ;)" + note.toString());
            }
        }
    }
    public void add(Notebook note) {
        if (!showcase.containsKey(note.getId())) {
            showcase.put(note.getId(), note);
        } else {
            System.out.println("Такой уже есть, оставь себе ;)" + note.toString());
        }
    }

    public Notebook filter() {
        System.out.println("Уточните характеристики ноута: ");
        Scanner scanner = new Scanner(System.in);

        for (var brend : this.components.getManufacturer().entrySet()) {
            System.out.printf("%d - %s\n", brend.getKey(), brend.getValue());
        }
        System.out.print("Выберите бренд: ");
        String manufacterer = scanner.nextLine();
        while ()

    }
}
