package Buoi3;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner
        int n;

        // Yêu cầu nhập số nguyên dương
        do {
            System.out.print("Nhập số nguyên dương n: ");
            n = scanner.nextInt();
        } while (n <= 0); // Điều kiện: nếu n <= 0 thì lặp lại yêu cầu nhập

//Nếu điều kiện đúng (nghĩa là n nhỏ hơn hoặc bằng 0), chương trình quay lại thực thi khối do.
//Nếu điều kiện sai (nghĩa là n lớn hơn 0), vòng lặp kết thúc, chương trinh được tiếp tục.


        int sum = 0;
        // Tính tổng S(n) = 1^3 + 2^3 + ... + n^3
        for (int i = 1; i <= n; i++) {
            sum += i * i * i; // (i^3) / Math.pow(i,3)
        }

        // Hiển thị kết quả
        System.out.println("Tổng S(n) = " + sum);
        scanner.close();
    }
}
