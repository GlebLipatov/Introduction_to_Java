package Introduction.HomeWorks.HW2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    private static String task = "\n3. Дана json-строка (можно сохранить в файл и читать из файла)\n" +
            "Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: " +
            "Студент [фамилия] получил [оценка] по предмету [предмет].\n";

    public static void solution() {
        System.out.println(task);
        String fileName = "src/input.txt";
        String input = getDataFromFile(fileName);
        String[] data = parse(input);
        print(data);

    }

    private static String getDataFromFile(String fileName) {
        StringBuilder sb = new StringBuilder();

        try (FileReader reader = new FileReader(new File(fileName))) {
            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                sb.append(ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString().substring(1, sb.toString().length() - 1);
    }

    private static String[] parse(String input) {
        StringBuilder sb;
        String[] result;

        String[] temp = input.replace("{", "")
                .replace("\"", "")
                .split("},*");

        result = new String[temp.length];

        for (int i = 0; i < temp.length; i++) {
            int NAME = 0;
            int RATING = 1;
            int SUBJECT = 2;
            int VALUE = 1;

            sb = new StringBuilder();
            String[] student = temp[i].split(",");

            String nameValue = student[NAME].split(":")[VALUE];
            String ratingValue = student[RATING].split(":")[VALUE];
            String subjectValue = student[SUBJECT].split(":")[VALUE];

            sb.append("Студент ")
                    .append(nameValue)
                    .append(" получил ")
                    .append(ratingValue)
                    .append(" по предмету ")
                    .append(subjectValue);

            result[i] = sb.toString();
        }
        return result;
    }

    private static void print(String[] data) {
        for (String str : data) {
            System.out.println(str);
        }
    }
}
