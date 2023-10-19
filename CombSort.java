public class CombSort {
    public static void combSort(int[] arr) {
        int n = arr.length;
        int gap = n;
        boolean swapped = true;
        int comparisons = 0; // Initialize the comparison counter

        while (swapped || gap > 1) {
            // Calculate the gap using the shrink factor (typically 1.3)
            gap = (int) (gap / 1.3);
            if (gap < 1) {
                gap = 1;
            }

            swapped = false;

            for (int i = 0; i < n - gap; i++) {
                int j = i + gap;

                comparisons++; // Increment the comparison counter
                if (arr[i] > arr[j]) {
                    // swap arr[i] and arr [j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
        }
        System.out.println("Number of comparisons required: " + comparisons);
    }
}
