import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

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

// package Lesson_04;

// import java.util.LinkedList;
// import java.util.Scanner;

// /**
//  * Lesson04
//  */
// public class Lesson04 {

//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         LinkedList<String> listlink = new LinkedList<>();
//         System.out.println("Enter string");
//         String str = iScanner.nextLine();
//         while (!str.equals("stop")) {
//             if (!str.contains("print~")) {
//                 listlink.add(str);
//             } else {
//                 String st = str.substring(6);
//                 System.out.println(st);
//                 int index = Integer.parseInt(st);
//                 System.out.println(listlink.get(index));
//                 listlink.remove(index);
//             }
//             System.out.println(listlink.toString());
//             System.out.println("Enter new string");
//             str = iScanner.nextLine();

//         }
//         iScanner.close();
//     }
// }

// package Lesson_04;

// import java.util.HashMap;
// import java.util.Map;

// /**
//  * Lesson04
//  */
// public class Lesson04 {

//     public static void main(String[] args) {
//         Map<Integer, String> data = new HashMap<>();
//         data.put(12312312, "Иванов");
//         data.put(213213, "Васильев");
//         data.put(3213123, "Петрова");
//         data.put(2131231, "Иванов");
//         data.put(331256566, "Петрова");
//         data.put(245667898, "Иванов");
//         for (var element : data.entrySet()) {
//             System.out.printf("key: %s; value: %s \n", element.getKey(), element.getValue());
//         }
//         for (var element : data.entrySet()) {
//             if (element.getValue().equals("Иванов")) {
//                 System.out.println(element.getKey());
//             }
//         }
//     }
// }

// package Lesson_04;

// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// import javax.print.attribute.IntegerSyntax;

// /**
//  * Lesson04
//  */
// public class Lesson04 {
//     public static boolean isIsomorf(String strFirst, String strSecond) {
//         if (strFirst.length() != strSecond.length()) {
//             return false;
//         }
//         Map<Character, Character> data = new HashMap<>();
//         for (int i = 0; i < strFirst.length(); i++) {
//             if (!data.containsKey(strFirst.charAt(i))) {
//                 data.put(strFirst.charAt(i), strSecond.charAt(i));
//             } else {
//                 if (data.get(strFirst.charAt(i)) != strSecond.charAt(i)) {

//                 }
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter first world!: ");
//         String strFirst = scn.nextLine();
//         System.out.println("Enter second world!: ");
//         String strSecond = scn.nextLine();
//         if (isIsomorf(strFirst, strSecond)) {
//             System.out.println("true");
//         } else {
//             System.out.println("false");
//         }
//         scn.close();

//     }
// }

// Написать программу определяющую правильность расстановки скобок в выражении.
// Пример 1: a +(d*3) - Истина
// Пример 2: [a +(1*3) - ложь
// Пример 3: [б +(3*3)] - Истина

/**
 * Lesson04
 */
public class Lesson04 {

    public static char isBrecket(char ch) {
        switch (ch) {
            case '[':
                return 1;
            case ']':
                return 2;
            case '(':
                return 3;
            case ')':
                return 4;
            default:
                return 0;

        }
    }

    public static boolean rightInput(String str) {
        Deque<Character> deg = new LinkedList<>();
        int isBrecket = 0;
        for (char element : str.toCharArray()) {
            int n = isBrecket(element);
            if (n > 0 && n < 5) {
                if (deg.size() == 0 && (n == 2 || n == 4) || deg.pollLast() != element) {
                    return false;
                } else {
                    if (deg.size() > 0) {
                        deg.getLast();
                    }
                    if (n == 1 || n == 3) {
                        deg.addLast(element);
                    }
                }
            }
        }
        String brecket = "";
        return true;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first word");
    }
}