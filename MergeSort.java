/**
 * The algorithm sorts the given array by Recursive Merge Sort
 * Input: An array A[0.. n-1] of order-able elements
 * Output: Array A[0.. n-1] sorted in ascending order
 */

// I believe I am missing comparisons somewhere, unsure how my algorithm is more efficient than the predicted number of comparisons

public class MergeSort {
    private static int Comparisons = 0;

    public static int getComparisons() {
        return Comparisons;
    }
    public static void mergeSort(int[] arr) {

        Comparisons = 0;

        if (arr == null || arr.length <= 1) {
            return; // already sorted
        }

        int n = arr.length / 2;
        int[] B = new int[n];
        int[] C = new int[arr.length - n];

        for (int i = 0; i < n; i++) { // Populate Left side of array
            B[i] = arr[i];
        }

        for (int i = 0; i < arr.length - n; i++) { // Populate Right side of array
            C[i] = arr[i + n];
        }

        mergeSort(B); // Recursive calls for left and right sub-arrays
        mergeSort(C);

        merge(arr, B, C); // Call Merge function to repopulate arrays after sorting

    }


    private static void merge(int[] arr, int[] B, int[] C) {
        int i = 0;
        int j = 0;
        int k = 0;


        while (i < B.length && j < C.length) {
        Comparisons++;                      //increment comparison counter
            if (B[i] <= C[j]) {                 // Checks if the element at position one of left array
                arr[k] = B[i];                  // is less than position one of right array
                k++;
                i++;

            } else {
                arr[k] = C[j];
                k++;
                j++;
            }
        Comparisons++;
        }                              // need to make sure that B[i] is not greater than C[j]
            while (i < B.length) {     // copies remaining elements Left side into array
                arr[k] = B[i];
                k++;
                i++;
                //Comparisons++;
            }


            while (j < C.length) {    // copies remaining elements Right side into array
                arr[k] = C[j];
                k++;
                j++;
                //Comparisons++;
            }

        }
}


