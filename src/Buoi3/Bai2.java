package Buoi3;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n, reversed =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n = sc.nextInt();

        // Vòng lặp để đảo ngược các chữ số
        while (n != 0) {
            int digit = n % 10; // Lấy chữ số cuối cùng của n (phần dư khi chia cho 10)
            reversed = reversed * 10 + digit; // Thêm chữ số vừa lấy vào kết quả đảo ngược
            n /= 10; // Loại bỏ chữ số cuối cùng (chia nguyên n cho 10)
        }

        System.out.println(reversed);
    }
}

