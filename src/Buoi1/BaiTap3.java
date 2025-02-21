package Buoi1;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        System.out.println("nhập vào chiều rộng hình chữ nhật: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("nhập vào chiều cao hình chữ nhật: ");
        int b = new Scanner(System.in).nextInt();

        int area = a * b;
        System.out.println("diện tích hình chữ nhật là " + area);
    }
}
