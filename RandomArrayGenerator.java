import java.util.Random;

    // method to populate an array with randomized integers
    public class RandomArrayGenerator {
        public static void Generate(int[] array, int max) {
            // number generator is created
            Random gen = new Random();
            // each position in an array is filled with a random
            for (int i = 0; i < array.length; i++) {
                array[i] = gen.nextInt(max + 1);
            }
        }
    }