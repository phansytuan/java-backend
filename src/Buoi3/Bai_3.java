package Buoi3;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số: ");
        int n = sc.nextInt();

        int soGiaiThua=1;
        for (int i = 1; i <= n; i++) {
            soGiaiThua = soGiaiThua*i;
        }
        System.out.println("giai thừa của n là: "+soGiaiThua);
    }
}
