package HomeWork_Java;
//Задача 1

import java.io.BufferedReader;
import java.io.FileReader;
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

        while (iScanner.hasNextLine()) {
            String line = iScanner.nextLine();
            // System.out.println(line);
            String[] nums = line.split(" ");
            System.out.println(Arrays.toString(nums));

        }
        fr.close();
    }
}
