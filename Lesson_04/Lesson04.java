// // Pамерить время за которое в ArrayList добавится 100000 элементов.
// // Замерить время за которое в LinkedList добавятся 100000 элементов. Сравнить с предыдущим.

// package Lesson_04;

// import java.util.ArrayList;
// import java.util.LinkedList;

// public class Lesson04 {
//     public static void main(String[] args) {
//         long timeStart_1 = System.currentTimeMillis();
//         ArrayList<Integer> resiltList = new ArrayList<>();
//         for (int i = 0; i < 100000; i++) {
//             resiltList.add(0, i);
//         }
//         long timeFinish_1 = System.currentTimeMillis();

//         long timeStart_2 = System.currentTimeMillis();
//         LinkedList<Integer> ListLink = new LinkedList<>();
//         for (int i = 0; i < 100000; i++) {
//             ListLink.add(0, i);

//         }

//         long timeFinish_2 = System.currentTimeMillis();
//         System.out.printf("The time = %d", timeFinish_1 - timeStart_1);
//         System.out.println();
//         System.out.printf("The time = %d", timeFinish_2 - timeStart_2);
//         System.out.println();
//     }
// }

package Lesson_04;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Lesson04
 */
public class Lesson04 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        LinkedList<String> listlink = new LinkedList<>();
        System.out.println("Enter string");
        String str = iScanner.nextLine();
        while (!str.equals("stop")) {
            if (!str.contains("print~")) {
                listlink.add(str);
            } else {
                String st = str.substring(6);
                System.out.println(st);
                int index = Integer.parseInt(st);
                System.out.println(listlink.get(index));
                listlink.remove(index);
            }
            System.out.println(listlink.toString());
            System.out.println("Enter new string");
            str = iScanner.nextLine();

        }
        iScanner.close();
    }
}