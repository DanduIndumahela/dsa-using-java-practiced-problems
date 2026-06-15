package OOPs.Generic;

import java.util.Arrays;

public class Customgenricarraylist<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 12;
    private int size = 0;

    public Customgenricarraylist() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void aadd(T num) {
        if (isfull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isfull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    public void sett(int index, T value) {
        data[index] = value;
    }

    public T gett(int index) {
        return (T) data[index];
    }

    @Override
    public String toString() {
        return "Customgenricarraylist{" +
                "data=" + Arrays.toString(Arrays.copyOf(data, size)) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Customgenricarraylist<Integer> list = new Customgenricarraylist<>();
        list.aadd(1);
        list.aadd(2);
        list.remove();
        list.gett(0);
        list.sett(0, 1);
        list.sett(0, 2);
        System.out.println(list);
    }
}
