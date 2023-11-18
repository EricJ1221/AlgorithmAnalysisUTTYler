/**
 * The algorithm sorts a given sub-array by Recursive Quick Sort
 * Input: A sub-array array A[l..r] of A[0..n-1],
 * defined by its left and right indices, l and r
 * Output: The sub-array A[l..r] sorted in non-decreasing (ascending) order
 */


public class QuickSort {
    /** if l < r
    s  <- Partition(A[l..r]) // s is a split position, pivot value
    quickSort(A[l..s-1])
    quickSort(A[s+1..r)
    */

    private static int Comparisons = 0;

    public static int getComparisons() {
        return Comparisons;
    }
    public static void quickSort(int[] arr){ // l = left indices, r = right indices
        Comparisons = 0;

        if ( arr == null || arr.length <=1){
            return; // already sorted or invalid input, needed to stop function
        }
            quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int l, int r){
        Comparisons++;
        if(l < r){
            int partitionIndex = Partition(arr, l, r);


            quickSort(arr, l, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, r);
        }
    }

    /**
     * Partions a sub-array by using its first elementas a pivot
     * Input: A sub-array A[l..r] of A[0..n-1], defined by
     *          its left and right indices l and r ( l < r )
     * Output: A partition of A[l..r], with the split position
     *          returned as this function's value
     */
    public static int Partition(int[] arr, int l, int r) { // private method, it's only used in this function
        int s = arr[r]; // s = pivot point
        int i = l - 1; // index of smallest element

        for (int j = l; j < r; j++) {
            Comparisons++;
            if (arr[j] <= s) {
                i++;

                int temp = arr[i]; // swap arr[i] and arr[j], beginning of sorting
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1]; // Swapping to put pivot in the correct position
        arr[i +1] = arr[r];
        arr[r] = temp;

        return i + 1;
    }
}
