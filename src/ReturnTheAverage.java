public class ReturnTheAverage {
    public static void main(String[] args) {
        int[] array = {25, 5, 20, 35, 7};
        double num = 0;
        double average;

        for (int i = 0; i < array.length; i++) {
            num += array[i];
        }
        average = num / array.length;
        System.out.println(average);
    }
}


