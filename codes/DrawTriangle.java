public class DrawTriangle{
    public static void drawTriangle (int N){
        int row = 0;
        while (row <= N) {
            int size = 0;
            while (size < row) {
                System.out.print("*");
                size = size + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
    public static void main(String[] args) {
        drawTriangle(10);
    }
}

