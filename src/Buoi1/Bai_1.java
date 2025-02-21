package Buoi1;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập họ và tên: ");
        String name = sc.nextLine();
        System.out.println("nhập ngày tháng năm sinh: ");
        String dob = sc.nextLine();
        System.out.println("nhập quê quán: ");
        String country = sc.nextLine();
        System.out.println("nhập trường học: ");
        String school = sc.nextLine();
        System.out.println(" Xin chào "+ name+ " đến từ "+country+ " sinh ngày "+dob+ " học tại trường "+school);
    }

}
