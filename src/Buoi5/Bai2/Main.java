package Buoi5.Bai2;

// Lớp trừu tượng Animal
abstract class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter cho tên
    public String getName() {
        return name;
    }

    // Phương thức trừu tượng
    public abstract void makeSound();
}

// Lớp Lion kế thừa từ Animal
class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion is roaring.");
    }
}

// Lớp Elephant kế thừa từ Animal
class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant is trumpeting.");
    }
}

// Lớp Monkey kế thừa từ Animal
class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey is chattering.");
    }
}

// Lớp chính để chạy chương trình
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Lion("Sư Tử");
        animals[1] = new Elephant("Voi");
        animals[2] = new Monkey("Khỉ");
        animals[3] = new Lion("Sư Tử 2");
        animals[4] = new Monkey("Khỉ 2");
        for (Animal animal : animals) {
            System.out.print(animal.getName() + ": ");
            animal.makeSound();
        }
    }
}

