package Buoi3;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        n = sc.nextInt();

        long soGiaiThua = 1;
        for (int i = 1; i <= n; i++) {
            soGiaiThua*=i;
            System.out.println(i);
        }
        System.out.println(soGiaiThua);
    }
}

