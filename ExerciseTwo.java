public class ExerciseTwo {
    public static int max(int[] arr) {
        int maxValue = 0;
        for (int i=0; i < arr.length; i++){
            int val = arr[i];
            if (val > maxValue) {
                maxValue = val;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
