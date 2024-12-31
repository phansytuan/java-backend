package Buoi5.Bai3;

import java.util.Scanner;

// Lớp trừu tượng Animal
abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void action();

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public String getName() {
        return name;
    }
}

// Các lớp con cụ thể
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("The lion is hunting.");
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("The elephant is spraying water.");
    }
}

class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("The monkey is climbing trees.");
    }
}

// Lớp quản lý động vật
class ManagerAnimal {
    private Animal[] zooAnimals;
    private int count;
    private Scanner scanner;

    public ManagerAnimal() {
        zooAnimals = new Animal[10];
        count = 0;
        scanner = new Scanner(System.in);
    }

    // Thêm động vật
    public void addAnimal(Animal animal) {
        if (count == zooAnimals.length) {
            expandArray();
        }
        zooAnimals[count++] = animal;
    }

    // Mở rộng mảng
    private void expandArray() {
        Animal[] newZooAnimals = new Animal[zooAnimals.length + 10];
        System.arraycopy(zooAnimals, 0, newZooAnimals, 0, zooAnimals.length);
        zooAnimals = newZooAnimals;
    }

    // Hiển thị danh sách động vật
    public void listAllAnimals() {
        if (count == 0) {
            System.out.println("The zoo has no animals.");
            return;
        }
        System.out.println("List of animals in the zoo:");
        for (int i = 0; i < count; i++) {
            zooAnimals[i].showInfo();
            zooAnimals[i].action();
        }
    }

    // Tìm kiếm động vật theo tên
    public void searchAnimalByName(String name) {
        for (int i = 0; i < count; i++) {
            if (zooAnimals[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Animal found:");
                zooAnimals[i].showInfo();
                zooAnimals[i].action();
                return;
            }
        }
        System.out.println("Animal not found.");
    }

    // Xóa động vật theo tên
    public void removeAnimalByName(String name) {
        for (int i = 0; i < count; i++) {
            if (zooAnimals[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    zooAnimals[j] = zooAnimals[j + 1];
                }
                zooAnimals[--count] = null;
                System.out.println("Animal " + name + " removed.");
                return;
            }
        }
        System.out.println("Animal not found.");
    }

    // Nhập danh sách động vật
    public void inputAnimals() {
        System.out.println("Enter the total number of animals to add: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Choose an animal to add: ");
            System.out.println("1) Lion");
            System.out.println("2) Elephant");
            System.out.println("3) Monkey");
            System.out.println("4) Stop adding");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 4) {
                break;
            }

            System.out.print("Enter animal name: ");
            String name = scanner.nextLine();
            System.out.print("Enter animal age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addAnimal(new Lion(name, age));
                    break;
                case 2:
                    addAnimal(new Elephant(name, age));
                    break;
                case 3:
                    addAnimal(new Monkey(name, age));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

// Lớp chính
public class Main {
    public static void main(String[] args) {
        ManagerAnimal manager = new ManagerAnimal();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nZoo Management System:");
            System.out.println("1) Input animals");
            System.out.println("2) Display all animals");
            System.out.println("3) Search for an animal");
            System.out.println("4) Remove an animal");
            System.out.println("5) Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manager.inputAnimals();
                    break;
                case 2:
                    manager.listAllAnimals();
                    break;
                case 3:
                    System.out.print("Enter animal name to search: ");
                    String nameToSearch = scanner.nextLine();
                    manager.searchAnimalByName(nameToSearch);
                    break;
                case 4:
                    System.out.print("Enter animal name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    manager.removeAnimalByName(nameToRemove);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
