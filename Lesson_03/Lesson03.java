package Lesson_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

// Заполнить список десятью случайными числами.Отсортировать
// список методом sort() и вывести его на экран.

// public class Lesson03 {
//     public static void main(String[] args) {
//         ArrayList arr = new ArrayList<Integer>();
//         Random rand = new Random();
//         for (int i = 0; i < 10; i++) {
//             int count = rand.nextInt(10);
//             arr.add(count);
//         }
//         System.out.println(arr.toString());
//         arr.sort(Comparator.naturalOrder());
//         System.out.println(arr);
//     }

// }

// Заполнить список названиями планет Солнечной системы в произвольном
// порядке с повторениями. Вывести названия каждой планеты и колличество повторений в списке.

// /**
//  * Lesson03
//  */
// public class Lesson03 {

//     public static void main(String[] args) {
//         ArrayList<String> arr = new ArrayList<>(
//                 Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Pluton",
//                         "Mercury", "Venus", "Earth", "Mars"));
//         int count = 0;
//         ArrayList<String> result = new ArrayList<>();
//         for (int i = 0; i < arr.size(); i++) {
//              count = 0;
//             if (!result.contains(arr.get(i))) {
//                 result.add(arr.get(i));
//                 for (int j = 0; j < arr.size(); j++) {
//                     if (arr.get(i).equals(arr.get(j))) {
//                         count += 1;
//                     }
//                 }
//                 System.out.println(arr.get(i) + count);
//             }

//         }
//     }
// }

//
/**
 * Lesson03
 */
public class Lesson03 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("mars");
        list.add("mars2");
        list.add("mars3");
        list.add("mars4");
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("22");
        list.add("marsian");
        list.add("marssadfas");

        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);

            }
        }
        System.out.println(list);

    }
}
