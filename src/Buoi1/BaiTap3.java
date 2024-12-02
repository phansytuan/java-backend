package Buoi1;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        System.out.println("Enter rectangle width: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Enter rectangle height: ");
        int b = new Scanner(System.in).nextInt();

        int area = a * b;
        System.out.println("Rectangle Area is " + area);
    }
}
