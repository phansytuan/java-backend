package Buoi1;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chiều dài hình chữ nhật: ");
        int h = sc.nextInt();
        System.out.println("nhập vào chiều rộng hình chữ nhật: ");
        int w = sc.nextInt();
        System.out.println("diện tích hình chữ nhật đó là: "+(w*h));
    }
}
