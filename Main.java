import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nМеню:");
            System.out.println("1 - Додати в кінець");
            System.out.println("2 - Додати за індексом");
            System.out.println("3 - Видалити за індексом");
            System.out.println("4 - Отримати елемент");
            System.out.println("5 - Кількість елементів");
            System.out.println("6 - Розмір буфера");
            System.out.println("7 - Вивести список");
            System.out.println("0 - Вихід");

            System.out.print("Ваш вибір: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введіть значення: ");
                    list.add(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Введіть індекс: ");
                    int i = sc.nextInt();
                    System.out.print("Введіть значення: ");
                    int v = sc.nextInt();
                    list.add(i, v);
                    break;

                case 3:
                    System.out.print("Введіть індекс: ");
                    list.remove(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Введіть індекс: ");
                    System.out.println("Елемент: " + list.get(sc.nextInt()));
                    break;

                case 5:
                    System.out.println("Кількість елементів: " + list.size());
                    break;

                case 6:
                    System.out.println("Розмір буфера: " + list.bufferSize());
                    break;

                case 7:
                    System.out.print("Список: ");
                    list.print();
                    break;

                case 0:
                    System.out.println("Вихід з програми");
                    break;

                default:
                    System.out.println("Невірна команда");
            }

        } while (choice != 0);

        sc.close();
    }
}