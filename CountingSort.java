
import java.util.Arrays;

/**
 * @ Pigeonhole sort
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, -4, 3, 0, 0, 1, 2};

        final int min = getMin(arr);
        final int max = getMax(arr);
        int[] freq = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] - min]++;
        }

        int arrIndex = 0;
        for (int i = 0; i < freq.length; i++) {
            for (int elems = freq[i]; elems > 0; elems--) {
                arr[arrIndex++] = i + min;
            }
        }
        printArray(arr);

    }


    private static int getMin(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }


    private static int getMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    private static void printArray(int[] arr){
        System.out.println("Array: " + Arrays.toString(arr));
    }

}