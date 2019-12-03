import java.util.Arrays;
import java.util.Collections;


public class ReverseSortedArray {
    public static void main(String[] args) {
        Integer[] numbers = {2, 3, 1, 7, 11};
        Arrays.sort(numbers, Collections.reverseOrder());
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
