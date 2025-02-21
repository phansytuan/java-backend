package Buoi2;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số giờ làm việc của nhân viên: ");
        int soGioLamViec = sc.nextInt();
        int luongNhanVien = 0;

        if(soGioLamViec <=40){
            luongNhanVien = soGioLamViec*50000;
        }
        else if(soGioLamViec >40){
            luongNhanVien = (int) (40*50000+ (soGioLamViec-40)*1.5*50000);
        }
        System.out.println("lương nhân viên là: "+luongNhanVien+"vnđ");
    }
}
