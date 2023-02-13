package lk.ijse.dep10.ds.util;

import java.util.Arrays;

public class DynamicArray {

    private int[] data = new int[0];

    public void add(String value) {
        int[] temp = new int[data.length + 1];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        temp[temp.length - 1] = Integer.parseInt(value);

        data = temp;
    }

    public void clear() {
        data = new int[0];
    }

    public int size() {
        return data.length;
    }

    public String get(int index) {
        return data[index] + "";
    }

    public boolean contains(String input) {
        for (int num : data) {
            if (num == Integer.parseInt(input)) return true;
        }
        return false;
    }

    public void remove(int index) {
        if (data.length == 0) return;

        int[] temp = new int[data.length - 1];

        for (int i = 0; i < data.length; i++) {
            if (i < index){
                temp[i] = data[i];
            }else if (i > index){
                temp[i - 1] = data[i];
            }
        }

        data = temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
