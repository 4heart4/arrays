import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] array = {3, 2, 3, 1, 4, 2, 8, 3};

        for (int i = 0; i < array.length; i++) {
            for (int z = i + 1; z < array.length; z++) {
                if (array[i] == (array[z])) {
                    array[z] = 0;
                }
            }
        }
            System.out.println(Arrays.toString(array));
        }
    }