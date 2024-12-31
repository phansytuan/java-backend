package Buoi5.Bai1;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Lion với tên và tuổi
        Lion lion = new Lion("Sư Tử",5);
        System.out.println("Lion name: " + lion.name + ", Age: " + lion.age);
        lion.eat();
        lion.roar();
        System.out.println();

        Elephant elephant=new Elephant("Voi",10);
        System.out.println("Elephant name: " + elephant.name + ", Age: " + elephant.age);
        elephant.eat();
        elephant.trumpet();
    }
}
