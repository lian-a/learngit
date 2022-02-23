public class SLList {
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int x, IntNode n) {
            item = x;
            next = n;
        }
    }

    public IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    public static void main(String[] args) {
        SLList L = new SLList(10);
        L.addFirst(5);
        L.addLast(1);
        System.out.println(L.getFirst());
        System.out.println(L.getsize());
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }
    public int getFirst() {
        return first.item;
    }
/** this method aims to get the size of the list iteratively
    public int getsize() {
        IntNode p = first;
        int size = 1;
        while(p.next != null) {
            size++;
            p = p.next;
        }
        return size;
    }
*/
    private static int helper(IntNode p) {
        if(p.next == null)
            return 1;
        return 1 + helper(p.next);
    }
    /**calculate the size recursivly */
    public int getsize() {
        return helper(first);
    }

    public void addLast(int x) {
        IntNode p = first;
        /**move p until it reach the end of the list*/
        while(p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }
}
