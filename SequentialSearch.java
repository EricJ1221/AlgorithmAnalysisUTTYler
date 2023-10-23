/**
 * The algorithm searches the given array by Sequential Search
 * Input: An array A[0.. n-1] of order-able elements and a key K
 * Output: Returns the element of A at K index
 * or -1 if there are no matching elements
 */
import java.util.ArrayList;
import java.util.List;
public class SequentialSearch {
    public static int sequentialSearchItemAtIndex(int[] arr, int K) {
        int i = 0;
        while (i < arr.length - 1 && arr[i] != K) {
            i++;
            if (arr[i] == K) {  //This returns the value at arr[k]
                return arr[K];
            }
        }
        return -1;
    }

    /**
     * The sequentialSearchForValue algorithm searches the given array by Sequential Search
     * Input: An array A[0.. n-1] of order-able elements and a key K
     * Output: Returns the element of A at K index
     * or -1 if there are no matching elements
     */
//unfinished needs work
    public static int sequentialSearchForValue(int[] arr, int K) { // needs edited to return the index of the value K
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == K) {
                //M = i;
                return arr[i]; // & M;
            }
        }
        return -1; // Return -1 if the value is not found in the array.
    }

    /**
     * The sequentialSearchForAllOccurrences algorithm searches the given array by Sequential Search
     * Input: An array A[0.. n-1] of order-able elements and a key K
     * Output: Returns the element of A at K index
     * or -1 if there are no matching elements
     */
    public static int[] sequentialSearchForAllOccurrences(int[] arr, int K) {
        List<Integer> occurrences = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == K) {
                occurrences.add(i);
            }
        }

        int[] result = new int[occurrences.size()];
        for (int i = 0; i < occurrences.size(); i++) {
            result[i] = arr[occurrences.get(i)];
        }

        return result;
    }
}
