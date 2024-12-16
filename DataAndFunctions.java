
/*
1. Написать метод, возвращающий количество чётных элементов массива.
countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0

2. Написать функцию, возвращающую разницу между самым большим и
самым маленьким элементами переданного не пустого массива.

3. Написать функцию, возвращающую истину, если в переданном
массиве есть два соседних элемента, с нулевым значением.
 */


public class DataAndFunctions {

    public static void main(String[] args) {
        int[] arr = {1,3,5,0,0,5};

        System.out.println("Count evens: " + countEvens(arr));
        System.out.println("Spread: " + spread(arr));
        System.out.println("two zero: " + zero2(arr));
    }

    /**
     * @apiNote метод подсчитывает количество четных чисел
     * из полученного массива int[]
     * @return количесчтво четных int
     */
    private static int countEvens(int[] arr){
        int number = 0;
        for (int i=0; i < arr.length; i++){
            if (arr[i] % 2  == 0){
                number++;
            }
        }
        return number;
    }


    /**
     * @apiNote метод отнимает от максимального минимальное число
     * из полученного массива int[]
     * @return возвращает разницу между максимальным и минимальным числом int
     */
    private static int spread(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i=0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max - min;
    }

    /**
     * @apiNote ищет два соседних элемента, с нулевым значением
     * в переданном массиве int[]
     * @return boolean, true если два соседних элемента, с нулевым значением
     */
    private static boolean zero2(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 0 & arr[i+1] == 0){
                return true;
            }
        }
        return false;
    }


}
