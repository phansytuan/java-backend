package Buoi3;

import java.util.Scanner;

public class Bai3 {

    // Hàm kiểm tra số hoàn hảo
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) { // khi ước của 1 số chia hết cho số đó
                sum += i;
            }
        }
        return sum == n;
    }

    // Hàm kiểm tra số Armstrong
    public static boolean isArmstrong(int n) {
        int sum = 0, temp = n, digits = String.valueOf(n).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }

    // Hàm kiểm tra số đối xứng
    public static boolean isPalindrome(int n) {
        String str = String.valueOf(n);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Hàm tính tổng các chữ số
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một dãy số nguyên dương (cách nhau bởi dấu cách): ");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            System.out.println("\nSố: " + num);

            if (isPerfect(num)) {
                System.out.println(num + " là số hoàn hảo.");
            } else {
                System.out.println(num + " không phải là số hoàn hảo.");
            }

            if (isArmstrong(num)) {
                System.out.println(num + " là số Armstrong.");
            } else {
                System.out.println(num + " không phải là số Armstrong.");
            }

            if (isPalindrome(num)) {
                System.out.println(num + " là số đối xứng.");
            } else {
                System.out.println(num + " không phải là số đối xứng.");
            }

            System.out.println("Tổng các chữ số của " + num + " là: " + sumOfDigits(num));
        }
    }
}

