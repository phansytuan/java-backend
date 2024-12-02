package Buoi4;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // buoc 1: nhập số lượng phần tử
        System.out.print("Nhập số lượng số tự nhiên (n): ");
        int n = scanner.nextInt();

        //  mảng để lưu các số
        int[] numbers = new int[n];

        // buoc 2: nhập các số từ bàn phím
        System.out.println("Nhập " + n + " số tự nhiên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Số thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // buoc 3: hiển thị các số đã nhập
        System.out.println("\nCác số đã nhập:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // buoc 4: tính tổng các số
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nTổng các số: " + sum);

        // buoc 5: tìm số min max
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) { max = num; }
            if (num < min) { min = num; }
        }
        System.out.println("Số lớn nhất: " + max);
        System.out.println("Số nhỏ nhất: " + min);

        scanner.close();
    }
}

