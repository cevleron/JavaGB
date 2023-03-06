package HomeWork_Java;

import java.util.Scanner;

// 1.Вычислить n-ое треугольного число(сумма чисел от 1 до n),а так же n!(произведение чисел от 1 до n)
// Ввод:5 
// Треугольное число 1+2+3+4+5=15 
// n!1*2*3*4*5=120

/**
 * home_work_1
 */
// public class home_work_1 {
//     public static void main(String[] args) {
//         Scanner num = new Scanner(System.in);
//         int n;
//         System.out.print("Введите число: ");
//         n = num.nextInt();
//         System.out.println("Ваше число: " + facrtorial(n));

//     }

//     static int facrtorial(int n) {
//         int result = 1;
//         for (int i = 1; i <= n; i++) {
//             result = result * i;
//         }
//         return result;
//     }
// }

// 2.Вывести все простые числа от 1 до 1000
/**
 * Innerhome_work_1
 */
// public class home_work_1 {
//     public static void main(String[] args) {

//         for (int j = 2; j <= 1000; j++) {
//             boolean simple = false;

//             for (int i = 2; i * i <= j; i++) {
//                 simple = (j % i == 0);
//                 if (simple) {
//                     break;
//                 }
//             }
//             if (!simple) {
//                 System.out.print(j + " ");
//             }
//         }
//     }

// }

// 3.Реализовать простой калькулятор(+-/*)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
// Ответ ->

/**
 * home_work_1
 */
public class home_work_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calculation(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }

    public static int getInt() {
        System.out.println("Введите число: ");
        int num;
        num = scanner.nextInt();
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите знак операции: ");
        char operation;
        operation = scanner.next().charAt(0);
        return operation;

    }

    public static int calculation(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;

            // Требуется пояснения преподавателя. Почему не работает return без данного
            // блока рекурсии?
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calculation(num1, num2, getOperation());
        }
        return result;
    }
}

// public static void main(String[] args) {
// Scanner num = new Scanner(System.in);
// System.out.println("Введите первое число: ");
// System.out.println("Введите второе число: ");
// System.out.println("Введите знак: ");
// int num1 = num.nextInt();
// int num2;

// 4.*(ДОПОЛНИТЕЛЬНАЯ)+Задано уравнение вида q+w=e,q,w,e>=0.
// Некоторые цифры могут быть заменены знаком вопроса,например
// 2?+?5=69(пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить,что его нет.
// Ввод:2?+?5=69
// Вывод:24+45=69

// public class home_work_1 {
// public static void main(String[] args) {

// }
// }
