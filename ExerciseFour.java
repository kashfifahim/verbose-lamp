public class ExerciseFour {
    /* Write a function windowPosSum(int[] a, int n) */
    public static void windowPosSum(int[] a, int n) {
        for (int i=0; i < i + n; i++) {
            if (a[i] > a.length) break;
            if (a[i] < 0) continue;
            int oValue = a[i];
            for (int j=i+1; j < n; j++) {
                int nextVal = a[j];
                oValue = oValue + nextVal;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
