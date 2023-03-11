package HomeWork_Java;
//Задача 1

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.Arrays;
import java.util.Scanner;

// Реализуйте алгоритм сортировки пузырьком числового массива(введён вами),

// результат после каждой итерации запишите в лог-файл.

// public class home_work_2 {
//     public static void bubbleSort(int[] massiv) {
//         for (int i = 0; i < massiv.length - 1; i++) {
//             for (int j = 0; j < massiv.length - i - 1; j++) {
//                 if (massiv[j + 1] < massiv[j]) {
//                     int swap = massiv[j];
//                     massiv[j] = massiv[j + 1];
//                     massiv[j + 1] = swap;
//                 }
//             }
//         }
//     }
//     public static void main(String args[]) {
//         int[] massiv = { 12, 6, 4, 1, 15, 10 };
//         bubbleSort(massiv);
//         for (int i = 0; i < massiv.length; i++) {
//             System.out.print(massiv[i] + "\n");
//         }
//     }

// }

// Задача 2
// Дана строка (получение через обычный текстовый файл!!!)
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder,
// создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
/**
 * home_work_2
 */
public class home_work_2 {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("students.txt");
        Scanner iScanner = new Scanner(fr);
        System.out.println(iScanner);
        StringBuilder bild = new StringBuilder();

        // String texts = new String();
        // texts = iScanner.nextLine();
        // System.out.println(texts);

        while (iScanner.hasNextLine()) {
            String line = iScanner.nextLine();
            // System.out.println(line);
            String[] nums = line.split("\"");
            // System.out.println(Arrays.toString(nums));
            bild.append("Студент ");
            bild.append(nums[3]).append(" ").append("получил").append(" ");
            bild.append(nums[7]).append(" ").append("по предмету").append(" ").append(nums[11]);
            bild.append("\n");
        }

        System.out.println(bild.toString());
        FileWriter fw = new FileWriter("new_students.txt");
        fw.write(bild.toString());

        fr.close();
        fw.close();
    }
}

// Решения для задачи 2. В случае если все данные введены в 1 строку.
// /**
// * home_work_2
// */
// public class home_work_2 {
// public static void main(String[] args) throws Exception {
// FileReader fr = new FileReader("src/homeWork2/test.txt");
// Scanner iScanner = new Scanner(fr);
// System.out.println(iScanner);
// StringBuilder bild = new StringBuilder();
// String texts;
// texts = iScanner.nextLine();
// String[] newLine = texts.split("}");
// System.out.println(Arrays.toString(newLine));

// for (String item : newLine) {
// System.out.println(item);
// String[] nums = item.split("");
// if (nums.length > 10) {
// bild.append("Студент ");
// bild.append(nums[3]).append(" ").append("получил").append(" ");
// bild.append(nums[7]).append(" ").append("по предмету").append("
// ").append(nums[11]);
// bild.append("\n");
// }
// }
// System.out.println(bild);
// FileWriter fw = new FileWriter("new_test.txt");
// fw.write(bild.toString());
// fr.close();
// fw.close();
// }
// }
