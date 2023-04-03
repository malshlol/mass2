import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] payments = generateRandomArray();
        System.out.println(Arrays.toString(payments));
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }


    public static void task2() {
        System.out.println("Задача 2");
        int[] payments = generateRandomArray();
        System.out.println(Arrays.toString(payments));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > max) {
                max = payments[i];
            }
            if (payments[i] < min) {
                min = payments[i];
            }
            if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
                System.out.println("Минимальная сумма трат за день составила" + min + "рублей. Максимальная сумма трат составила " + max + "рублей");
            }


        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] payments = generateRandomArray();
        System.out.println(Arrays.toString(payments));
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
        }
        System.out.printf("Средняя суммв за месяц составила " + (double) sum / payments.length + "рублей");
        System.out.println();


    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println(reverseFullName[i]);
        }
        System.out.println();
    }

    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}