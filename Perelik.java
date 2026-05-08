public class Perelik {

    private int[] elements;
    private int size;
    private int capacity;

    public Perelik() {
        capacity = 10;
        elements = new int[capacity];
        size = 0;
    }

    private void resize() {

        capacity = capacity * 2;

        int[] newArray = new int[capacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }

        elements = newArray;
    }

    public void add(int value) {

        if (size == capacity) {
            resize();
        }

        elements[size] = value;
        size++;
    }

    public void addByIndex(int index, int value) {

        if (index < 0 || index > size) {
            System.out.println("Помилка! Неправильний індекс.");
            return;
        }

        if (size == capacity) {
            resize();
        }

        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        elements[index] = value;
        size++;
    }

    public void remove(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Помилка! Неправильний індекс.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        size--;
    }

    public int get(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Помилка! Неправильний індекс.");
            return -1;
        }

        return elements[index];
    }

    public int getSize() {
        return size;
    }

    public int getBufferSize() {
        return capacity - size;
    }

    public void print() {

        System.out.print("Перелік: ");

        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }

        System.out.println();
    }
}