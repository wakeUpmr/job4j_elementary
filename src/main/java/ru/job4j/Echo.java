package ru.job4j;

public class Echo {
    private int[] array;

    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Echo reduce = new Echo();
        reduce.to(array);
        reduce.print();
    }
}