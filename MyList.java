public class MyList {
    private int[] data;
    private int size;
    private int capacity;

    public MyList() {
        capacity = 10;
        data = new int[capacity];
        size = 0;
    }

    // збільшення буфера
    private void resize() {
        capacity *= 2;
        int[] newData = new int[capacity];

        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    // 1. додавання в кінець
    public void add(int value) {
        if (size == capacity) {
            resize();
        }
        data[size++] = value;
    }

    // 2. додавання за індексом
    public void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Помилка: некоректний індекс");
            return;
        }

        if (size == capacity) {
            resize();
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = value;
        size++;
    }

    // 3. видалення за індексом
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Помилка: некоректний індекс");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
    }

    // 4. отримання елемента
    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Помилка: некоректний індекс");
            return -1;
        }
        return data[index];
    }

    // 5. кількість елементів
    public int size() {
        return size;
    }

    // 6. кількість в буфері (вільне місце)
    public int bufferSize() {
        return capacity - size;
    }

    // для перегляду списку
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}