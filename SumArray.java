public class SumArray {
    /** Uses a while loop to sum a */
    public static int whileSum(int[] a) {
        int i = 0; // initialization
        int sum = 0;
        while (i < a.length) {
            sum = sum + a[i];
            i = i + 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        
    }
    
}
