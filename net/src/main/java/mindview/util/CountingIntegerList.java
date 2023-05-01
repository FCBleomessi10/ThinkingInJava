package mindview.util;

import java.util.AbstractList;

public class CountingIntegerList extends AbstractList<Integer> {
    private final int size;

    public CountingIntegerList(int size) {
        this.size = Math.max(size, 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Integer get(int index) {
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new CountingIntegerList(30));
    }
}
