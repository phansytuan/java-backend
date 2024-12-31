package Buoi5.Bai1;

public class Lion extends Animal{
    //Constructor
    public Lion(String name, int age) {
        super(name, age);  // gọi constructor của cha
    }
    //Method riêng
    public void roar(){
        System.out.println("Lion is Roaring");
    }
}
