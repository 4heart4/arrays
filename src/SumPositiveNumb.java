public class SumPositiveNumb {
    public static void main(String[] args) {
        int[] array = {25, -15, 4, -7, 5};
        int sum = 0;

        for (int i : array) {
            if (i > 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

