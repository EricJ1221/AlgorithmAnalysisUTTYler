/**
 * The algorithm sorts the given array by Insertion Sort
 * Input: An array A[0.. n-1] of order-able elements
 * Output: Array A[0.. n-1] sorted in ascending order
 */

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        int temp = 0;
        int j = 0;
        int comparisons = 0; // initialized the counter for comparisons

        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j]; //shift/copy one position to the right
                comparisons++;
                j--;                 //decrement
            }
            arr[j + 1] = temp;      // insert
        }
        System.out.println("Number of comparisons required: " + comparisons);
    }
}
