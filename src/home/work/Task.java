package home.work;

import java.util.Random;

public class Task {
    private int[] array;
    private int position;
    private int number;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getArray() {
        return array;
    }

    public int getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    public void initArray() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
        }
    }

    public int[] addNumberInArray() {
        int[] arr = new int[array.length + 1];

        for (int i = 0; i < getPosition(); i++) {
            arr[i] = array[i];
        }

        arr[getPosition()] = array[getPosition()];

        for (int i = getPosition() + 1; i < arr.length; i++) {
            arr[i] = array[i - 1];
        }

        return arr;
    }
}
