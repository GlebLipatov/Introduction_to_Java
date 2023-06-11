package Introduction.HomeWorks.HW2;

public class Task1 {
    private static String task = "1. Дана строка sql-запроса:git \"select * from students where \". " +
            "\nСформируйте часть WHERE этого запроса, используя StringBuilder. " +
            "\nДанные для фильтрации приведены ниже в виде json-строки." +
            "\nЕсли значение null, то параметр не должен попадать в запрос." +
            "\nПараметры для фильтрации: " +
            "\n{" +
            "\n\t\"name\":\"Ivanov\"," +
            "\n\t\"country\":\"Russia\"," +
            "\n\t\"city\":\"Moscow\"," +
            "\n\t\"age\":\"null\"" +
            "\n}";
    private static String request = "select * from students where ";
    private static String json = "{\"name\":\"Ivanov\",\"country\":\"Russia\",\"city\":\"Moscow\",\"age\":\"null\"}";

    public static void solution() {
        String[] data = parse(json);
        String result = createRequest(request, data);
        System.out.printf("%s \n\nResult: %s", task, result);
    }

    private static String[] parse(String json) {
        return json
                .substring(1, json.length() - 1)
                .replace("\"", "")
                .split(",");
    }

    private static String createRequest(String request, String[] data) {
        StringBuilder sb = new StringBuilder(request);
        for (int i = 0; i < data.length; i++) {
            String key = data[i].split(":")[0];
            String value = data[i].split(":")[1];
            if (!value.equals("null")) {
                sb.append(key)
                        .append("='")
                        .append(value)
                        .append("' ");
            }
        }
        return sb.toString();
    }
}
