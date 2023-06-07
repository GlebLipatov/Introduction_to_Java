package Introduction.HomeWorks.HW1;

import java.io.FileWriter;
import java.io.IOException;

public class Task9 {
    String message = "9. Записать в файл данные";
    String[][] data = new String[][] {{"Name", "Surname", "Age"},
                                        {"Kate", "Smith", "20"},
                                        {"Paul", "Green", "25"},
                                        {"Mike", "Black", "23"},};
    public void solution(){
        System.out.println("\n" + message);
        try (FileWriter fw = new FileWriter("file.txt", true)) {
            for (String[] row : data) {
                for (String cell : row) {
                    fw.write(cell + " ");
                }
                fw.write("\n");
            }
            fw.write("\n");
            System.out.println("File 'file.txt' is write.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
