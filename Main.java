import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Perelik list = new Perelik();

        int choice;

        do {

            System.out.println("\n--- МЕНЮ ---");
            System.out.println("1 - Додати в кінець");
            System.out.println("2 - Додати за індексом");
            System.out.println("3 - Видалити за індексом");
            System.out.println("4 - Отримати елемент");
            System.out.println("5 - Показати перелік");
            System.out.println("6 - Кількість елементів");
            System.out.println("7 - Кількість елементів у буфері");
            System.out.println("0 - Вихід");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Введіть значення: ");
                    int value = sc.nextInt();

                    list.add(value);

                    break;

                case 2:

                    System.out.print("Введіть індекс: ");
                    int index = sc.nextInt();

                    System.out.print("Введіть значення: ");
                    int val = sc.nextInt();

                    list.addByIndex(index, val);

                    break;

                case 3:

                    System.out.print("Введіть індекс: ");
                    int removeIndex = sc.nextInt();

                    list.remove(removeIndex);

                    break;

                case 4:

                    System.out.print("Введіть індекс: ");
                    int getIndex = sc.nextInt();

                    System.out.println("Елемент: " + list.get(getIndex));

                    break;

                case 5:

                    list.print();

                    break;

                case 6:

                    System.out.println("Кількість елементів: " + list.getSize());

                    break;

                case 7:

                    System.out.println("Кількість вільних місць у буфері: "
                            + list.getBufferSize());

                    break;

                case 0:

                    System.out.println("Програма завершена.");

                    break;

                default:

                    System.out.println("Неправильний вибір.");
            }

        } while (choice != 0);
    }
}