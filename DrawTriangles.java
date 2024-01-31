public class DrawTriangles {
    public static void drawTriangle(int N) {
        int numberOfLines = N; // Total number of lines
        for (int i=1; i <= numberOfLines; i++) {
            // Inner loop
            for (int j=1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawTriangle(10);
        drawTriangle(5);
    }
}
