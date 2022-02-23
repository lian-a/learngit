public class Printstar{
    public static void main(String[] args){
        int i = 5;
        int row = 1;
        while (row <= i){
            int size = 0;
            while (size < row){
                System.out.print('*');
                size = size + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
