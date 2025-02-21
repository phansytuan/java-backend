package Buoi4;
import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        String [] mangCacKyTu=new String[10];

        // nhập các số vào mảng
        Scanner sc = new Scanner(System.in);
        for(int index=0; index< mangCacKyTu.length; index++){
            // thu thập dữ liệu người dùng nhập vào
            System.out.println("Nhập vào phần tử có index: "+index);
            String duLieuMang= sc.nextLine();

            // gán dữ liệu vào mảng
            mangCacKyTu[index]=duLieuMang;
            // mangCacKyTu với cái phần tử thứ index sẽ được gán bằng dữ liệu của mảng
        }
        hienThi(mangCacKyTu);
    }

    private static void hienThi(String[] mangCacKyTu) {
        // duyệt qua và in ra các phần tử của mảng
        for(int index = 0; index< mangCacKyTu.length; index++){
            String duLieuMang= mangCacKyTu[index]; // index tăng dần ở trong vòng lặp
            System.out.print(duLieuMang+ " ");
        }
    }
}
