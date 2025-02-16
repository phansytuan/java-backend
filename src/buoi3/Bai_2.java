package buoi3;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        System.out.println("nhap vao so he 10: ");
        int n = new Scanner(System.in).nextInt();

        // Khởi tạo một chuỗi rỗng để lưu kết quả nhị phân
        String ketQua ="";
        // Khai báo biến tạm để lưu giá trị của số dư khi chia cho 2
        int bienTam;

        while (n!=0){
            bienTam=n%2;
            ketQua=bienTam+ketQua; // cộng chuỗi string concatenation
            n=n/2;
        }
        System.out.println("so nhi phan la: "+ketQua);
    }
}
