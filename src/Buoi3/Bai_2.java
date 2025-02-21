package Buoi3;
import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số: ");
        int n = sc.nextInt();

        // ta sẽ: lấy từng chữ số cuối của số n,
        // sau đó xây dựng số đảo ngược bằng cách
        // nhân số mới với 10
        // rồi cộng thêm chữ số đó

        int soDaoNguoc=0;
        while (n>0){
            int chuSo=n%10;
            soDaoNguoc=soDaoNguoc*10+chuSo;
            n=n/10;
        }
        System.out.println("Số đảo ngược: "+soDaoNguoc);
    }
}
