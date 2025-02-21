package Buoi3;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số n: ");
        int n = sc.nextInt();

        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (i*i*i);
        }
        System.out.println(sum);
    }
}
