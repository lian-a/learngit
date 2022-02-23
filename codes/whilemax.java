public class maxe{
    public static int max(int[] m) {
        int i = 1;
        int temp = m[0];
        while (i < m.length - 1) {
            if (temp < m[i]) {
                temp = m[i];
            }
            i = i + 1;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.print(max(numbers));
    }
}
