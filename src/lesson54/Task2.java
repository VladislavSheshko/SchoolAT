package lesson54;

//        Через аругмент командной строки передается строка - путь до некоторого файла -
//        содержащая знак «/» или «\». Например, "/bin/java" или "C:\Program Files\Java\bin\java".
//        Напишите программу, которая для обоих вариантов разделителей, может вывести отдельно путь и имя файла.
//        Если имя файла отсутствует, т.е. строка оканчивается на "\" или "/",
//        то выдать ошибку: "Введен некорректный путь до файла."
//        Пример:
//        1) Через аргументы передается "/bin/java", выводится:
//        Путь: /bin/
//        Имя файла: java
//        2) Через аргументы передается "C:\Program Files\Java\bin\java", выводится:
//        Путь: C:\Program Files\Java\bin\
//        Имя файла: java
//        3) Через аргументы передается "/", выводится:
//        Введен некорректный путь до файла.
//        Проверку на наличие и корректность аргумента делать не надо.
public class Task2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Путь: ");
        String path = args[0];
        if (path.equals("/") || path.equals("\\"))
            System.out.println("Введен некорректный путь до файла.");
        else if (path.contains("\\")) {
            formatPath(builder, path, "\\");
        } else if (path.contains("/")) {
            formatPath(builder, path, "/");
        }
    }
    private static void formatPath(StringBuilder builder, String path, String delimiter){
        String[] array = path.split(delimiter.equals("/") ? delimiter : delimiter + delimiter);

        for (int i = 0; i < array.length - 1; i++) {
            builder.append(array[i]).append(delimiter);
        }
        System.out.println(builder);
        System.out.println("Имя файла: " + array[array.length - 1]);
    }
}
