/*  Sorted array: [2, 5, 12, 19, 23, 25, 90]   */
import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] numbers = {5, 23, 25, 12, 2, 19, 90};
        int n = numbers.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap temp and numbers[i]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
