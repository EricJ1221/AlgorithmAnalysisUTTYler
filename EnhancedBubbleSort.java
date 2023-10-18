/**
 * The algorithm sorts the given array by improved bubble sort
 * Input: An array A[0.. n-1] of orderable elements
 * Output: Array A[0.. n-1] sorted in ascending order
 */

public class EnhancedBubbleSort {
    public static void improvedBubbleSort(int[] arr) {

        int n = arr.length;
        boolean sflag = true;
        int comparisons = 0;

        while (sflag) {
            sflag = false;
            for (int i = 0; i < n - 1; i++) {
                comparisons++;
                if (arr[i + 1] < arr[i]) {
                    int temp = arr[i]; // create a temporary value to hold the array value at current index
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sflag = true;
                }
            }
            n--;
        }
        System.out.println("Number of comparisons required: " + comparisons);
    }
}
