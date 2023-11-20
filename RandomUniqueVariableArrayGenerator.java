import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class RandomUniqueVariableArrayGenerator {
    public static void Generate(int[] array, int max) {
        if (max < array.length) {
            throw new IllegalArgumentException("Maximum value should be greater than or equal to the array length.");
        }

        Random gen = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            int randomNumber;

            do {
                randomNumber = gen.nextInt(max + 1);
            } while (uniqueNumbers.contains(randomNumber));

            uniqueNumbers.add(randomNumber);
            array[i] = randomNumber;
        }
    }
}

