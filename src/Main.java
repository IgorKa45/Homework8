import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        float[] numbersFloat = {1.57f, 7.654f, 9.986f};

        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Объявили массивы");

        System.out.println("Задание 2");
        int i;
        //Выводим массив 1
        for (i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[2]);

        //Выводим массив 2
        System.out.println();
        for (i = 0; i < numbersFloat.length - 1; i++) {
            System.out.print(numbersFloat[i] + ", ");
        }
        System.out.print(numbersFloat[2]);

        //Выводим массив 3
        System.out.println();
        for (i = 0; i < letters.length - 1; i++) {
            System.out.print(letters[i] + ", ");
        }
        System.out.println(letters[4]);

        System.out.println("Задание 3");
        // Вывод массива 1
        for (i = numbers.length - 1; i > 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[0]);

        // Вывод массива 2
        System.out.println();
        for (i = numbersFloat.length - 1; i > 0; i--) {
            System.out.print(numbersFloat[i] + ", ");
        }
        System.out.print(numbersFloat[0]);

        //Вывод массива 3
        System.out.println();
        for (i = letters.length - 1; i > 0; i--) {
            System.out.print(letters[i] + ", ");
        }
        System.out.print(letters[0]);

        System.out.println();

        System.out.println("Задание 4");
        for (i = 0; i < numbers.length; i = i + 2) {
            numbers[i] = numbers[i] + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}