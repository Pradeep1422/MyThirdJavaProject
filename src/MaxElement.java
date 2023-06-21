public class MaxElement {
    public static void main(String[] args) {
        int[] array = { 5, 8, 2, 16, 1 };
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}

