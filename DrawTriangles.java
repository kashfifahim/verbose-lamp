public class DrawTriangles {
    public static void main(String[] args) {
        int numberOfLines = 5; // Total number of lines
        for (int i=1; i <= numberOfLines; i++) {
            // Inner loop
            for (int j=1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
