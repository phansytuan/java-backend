package Buoi3;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số: ");
        int n = sc.nextInt();

        String soNhiPhan="";
        while(n>0){
            int chuSo=n%2;
            soNhiPhan=chuSo+soNhiPhan; // ghép vào đầu chuỗi trước
            n=n/2;
        }
        System.out.println("số nhị phân của n là: "+soNhiPhan);
    }
}
