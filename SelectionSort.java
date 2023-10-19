/**
 * The algorithm sorts the given array by selection sort
 * Input: An array A[0.. n-1] of orderable elements
 * Output: Array A[0.. n-1] sorted in ascending order
 */



public class SelectionSort {
    public static void selectionSort(int[] arr){
        int comparisons = 0; // initialized the counter for comparisons
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++){
                comparisons++;
                if( arr[j] < arr[min])
                        min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Number of comparisons required: " + comparisons);
    }
}
