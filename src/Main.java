import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("задача 1");
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        // Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Напишите программу, которая решит эту задачу,
        // и выведите в консоль результат в формате:
        // «Сумма трат за месяц составила … рублей».
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("самма трат за месяц" + sum + "рублей");
    }

    public static void task2() {
        System.out.println("задача 2");
        //Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        // «Минимальная сумма трат за день составила … рублей.
        // Максимальная сумма трат за день составила … рублей».
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int val : arr) {
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
        }
        System.out.println("минимальная сумма трат за день составила" + min +
                "максимальная сумма трат за день составила" + max + "рублей");
    }
    public static void task3() {
        System.out.println("задача 3");
//Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
//Напишите программу, которая посчитает среднее значение трат за месяц
// (то есть сумму всех трат за месяц поделить на количество дней),
// и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
//Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
        int []arr = generateRandomArray();
        int sum =0;
        for (int i = 0;i< arr.length;i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println(" средняя сумма трат за месяц составила" +average+"рублей");
    }

    public static void task4() {
        System.out.println("задача 4");
//В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена
// сотрудников начали отображаться в обратную сторону.
// Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ».
// Данные с именами сотрудников хранятся в виде массива символов — char[ ].
//Напишите код, который в случае такого бага будет выводить
// фамилии и имена сотрудников в корректном виде. В качестве данных для массива используйте:
//char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//В результате в консоль должно быть выведено: Ivanov Ivan.
        char[] reverseFullName = {'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v', 'i'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
        // Объявить метод «сгенерироватьМассив»
        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
    }

