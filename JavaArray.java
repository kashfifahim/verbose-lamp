public class JavaArray {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 4;
        numbers[1] = 7;
        numbers[2] = 10;
        System.out.println(numbers[1]);

        int[] numbersB = new int[]{4, 7, 10};
        System.out.println(numbersB[1]);
    }
}
