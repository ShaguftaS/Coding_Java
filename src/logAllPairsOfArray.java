public class logAllPairsOfArray {
    public static void main(String[] args) {
        int[] boxes = {1, 2, 3, 4, 5};
        logAllPairs(boxes);
    }

    static void logAllPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("i = " + array[i] + ", j = " + array[j]);
            }
        }
    }
}