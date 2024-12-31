package Buoi5.Bai1;

public class Elephant extends Animal{
    public Elephant(String name, int age) {
        super(name, age);  // gọi constructor của cha
    }
    //Method riêng
    public void trumpet() {
        System.out.println("Elephant is Trumpeting");
    }
}
