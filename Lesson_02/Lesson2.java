// Задача 1.

// package Lessons;

// import java.util.Scanner;

// public class Lesson2 {
//     public static String builders(String a, String b, int n) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < n / 2; i++) {
//             sb.append(a);
//             sb.append(b);

//         }
//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         System.out.printf("Введите число N: ");
//         Scanner iScanner = new Scanner(System.in);
//         int n = iScanner.nextInt();
//         String a = "c1", b = "c2";
//         System.out.println(builders(a, b, n));
//         iScanner.close();

//     }
// }

// Задача 2
// Напишите метод, который сжимает строку.
// Пример:
// Вход: aaaabbbcddaa.
// Выход : a4b3cd2a2

// package Lessons;

// import java.util.Scanner;

// /**
//  * Lesson2
//  */
// public class Lesson2 {

//     public static void name(String N) {
//         StringBuilder sb = new StringBuilder();
//         int count = 1;
//         char temp = N.charAt(0);
//         for (int i = 1; i < N.length(); i++) {
//             if (temp != N.charAt(i)) {
//                 if (count != 1) {
//                     sb.append(count);
//                     count = 1;
//                 }
//                 sb.append(N.charAt(i));
//                 temp = N.charAt(i);
//             } else {
//                 count += 1;
//             }

//         }
//         if (count != 1) {
//             sb.append(count);
//         }
//         System.out.println(sb.toString());
//     }

//     public static void main(String[] args) {
//         System.out.println("Введите число N: ");
//         Scanner iScanner = new Scanner(System.in);
//         String N = iScanner.nextLine();
//         name(N);
//         iScanner.close();

//     }
// }

// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка полидромом (возвращает boolean значение).

// package Lessons;

// import java.util.Scanner;

// /**
//  * Lesson2
//  */
// public class Lesson2 {

//     public static boolean name(String N) {
//         for (int i = 1; i < N.length() / 2; i++) {
//             if (N.charAt(i) != N.charAt(N.length() - i - 1)) {
//                 return false;
//             }

//         }
//         return true;
//     }

//     public static void main(String[] args) {

//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("Введите число: ");
//         String N = iScanner.nextLine();
//         System.out.println(name(N));
//         iScanner.close();

//     }
// }

// Записать в текстовый файл слово TEST 10 раз.
package Lesson_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Lesson2
 */
public class Lesson2 {

    public static void main(String[] args) {
        File file = new File("aaa.text");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("TEST ");

        }
        try {
            FileWriter fr = new FileWriter(file, true);
            fr.write(sb.toString());
            fr.write("\n");
            fr.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    
    }
}