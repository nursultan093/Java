package Tasks.lab1;//Программа запрашивает возраст пользователя и выводит все четные числа до включительно этого возраста,
// если возраст четный, и все нечетные числа, если возраст нечетный.
//Ввод: Возраст пользователя.

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст пользователя: ");
        int age = scanner.nextInt();

        if (age % 2 == 0) {
            System.out.print("Четные числа до " + age + ": ");
            for (int i = 2; i <= age; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print("Нечетные числа до " + age + ": ");
            for (int i = 1; i <= age; i += 2) {
                System.out.print(i + " ");
            }
        }
    }
}
