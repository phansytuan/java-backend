package Buoi2;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số giờ làm việc: ");
        int gioLamViec = scanner.nextInt();

        final double luongCoBan = 50000;
        final double luong;
        final double heSoLamThem = 1.5 ;

        if (gioLamViec > 40) {
            luong = 40 * luongCoBan + (gioLamViec - 40) * luongCoBan * heSoLamThem;
        } else {
            luong = gioLamViec * luongCoBan;
        }

        System.out.println("Lương của nhân viên: " + luong + " VND");
    }
}

