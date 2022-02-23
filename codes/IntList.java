public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size() {
        if (this == null)
            return 0;
        return 1 + this.rest.size();
    }

    public int iterativeSize() {
        IntList p = this;
        int len = 0;
        while (p != null) {
            len++;
            p = p.rest;
        }
        return len;
    }
    public int get(int i) {
        if(i == 0)
            return first;
        return this.rest.get(i-1);
    }
}
