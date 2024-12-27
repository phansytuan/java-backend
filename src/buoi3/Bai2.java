package buoi3;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int n = scanner.nextInt();

        String binary = Integer.toBinaryString(n);
        System.out.println("Số nhị phân của " + n + " là: " + binary);
    }
}
