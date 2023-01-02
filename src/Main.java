import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {2, 25, 122, 1, 365, 5877, 2222, 67};

        // минимальный элемент массива
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }

        }

        System.out.println("Min " + min);

        // максимальный элемент массива
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            System.out.println("Max " + max);

        }
        // вывести четные и нечетные числа массивва
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                n = arr[i];
            }
            System.out.println("Четные элементы массива: " + n);
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                n = arr[j];
            }
            System.out.println("нечетные элементы массива: " + n);

            // по возрастанию
            Arrays.sort(arr);
            for (int val : arr) {
                System.out.println(val);
            }

        }
        // палиндромы
        for (int i = 0; i < ((arr.length) / 2); i++) {
            if (i == arr.length - i - 1) {
                System.out.println("палиндромы " + i);
            }
        }

    }
}