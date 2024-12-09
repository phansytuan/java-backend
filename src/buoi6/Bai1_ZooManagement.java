package buoi6;


import java.util.ArrayList;
import java.util.Scanner;

// Abstract class Animal
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
}

// Lion class
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("The lion is hunting.");
    }
}

// Elephant class
class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("The elephant is spraying water.");
    }
}

// Monkey class
class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("The monkey is climbing trees.");
    }
}

// ManagerAnimal class
class ManagerAnimal {
    private ArrayList<Animal> animals;

    public ManagerAnimal() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAllAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
        } else {
            for (Animal animal : animals) {
                animal.showInfo();
                animal.action();
            }
        }
    }

    public void searchAnimal(String name) {
        boolean found = false;
        for (Animal animal : animals) {
            if (animal.name.equalsIgnoreCase(name)) {
                animal.showInfo();
                animal.action();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Animal not found.");
        }
    }

    public void removeAnimal(String name) {
        boolean removed = animals.removeIf(animal -> animal.name.equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Animal removed successfully.");
        } else {
            System.out.println("Animal not found.");
        }
    }
}

public class Bai1_ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerAnimal manager = new ManagerAnimal();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Lion");
            System.out.println("2. Add Elephant");
            System.out.println("3. Add Monkey");
            System.out.println("4. Show all animals");
            System.out.println("5. Search animal by name");
            System.out.println("6. Remove animal by name");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Lion name: ");
                    String lionName = scanner.nextLine();
                    System.out.print("Enter Lion age: ");
                    int lionAge = scanner.nextInt();
                    manager.addAnimal(new Lion(lionName, lionAge));
                    break;
                case 2:
                    System.out.print("Enter Elephant name: ");
                    String elephantName = scanner.nextLine();
                    System.out.print("Enter Elephant age: ");
                    int elephantAge = scanner.nextInt();
                    manager.addAnimal(new Elephant(elephantName, elephantAge));
                    break;
                case 3:
                    System.out.print("Enter Monkey name: ");
                    String monkeyName = scanner.nextLine();
                    System.out.print("Enter Monkey age: ");
                    int monkeyAge = scanner.nextInt();
                    manager.addAnimal(new Monkey(monkeyName, monkeyAge));
                    break;
                case 4:
                    manager.showAllAnimals();
                    break;
                case 5:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    manager.searchAnimal(searchName);
                    break;
                case 6:
                    System.out.print("Enter name to remove: ");
                    String removeName = scanner.nextLine();
                    manager.removeAnimal(removeName);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}


