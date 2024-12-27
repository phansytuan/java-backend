package buoi3;
import java.util.Scanner;

public class Bai3 {

// Hàm kiểm tra số hoàn hảo
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

// Hàm kiểm tra số Armstrong
    public static boolean isArmstrong(int n) {
        int sum = 0, temp = n, digits = String.valueOf(n).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }

// Hàm kiểm tra số đối xứng
    public static boolean isPalindrome(int n) {
        String str = String.valueOf(n);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

// Hàm tính tổng các chữ số
    public static int sumOfDigits(int n) {  // hàm này có thể nhận vào 1 số nguyên dương n bất kỳ
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;

        /* vd: n = 121
            sum = 0 + 1(n%10) (chia 10 thì còn dư 1)
            n=12
            sum = 1
        ...
            sum = 1 + 2
        ...
            sum = 3 + 1
            sum = 4
        */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một dãy số nguyên dương (cách nhau bởi dấu cách): ");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");  // Tách dãy số thành mảng các chuỗi

        /*
        Là 1 vòng lặp for-each, duyệt qua từng số trong mảng.
        Lặp qua từng phần tử trong mảng numbers (mỗi phần tử là một chuỗi số).
        Tại mỗi lần lặp, phần tử hiện tại được gán vào biến numberString
        */
        for (String numberString : numbers) {

            int num = Integer.parseInt(numberString);  // Chuyển chuỗi thành số nguyên
            System.out.println("\nSố: " + num);

            /*
            Kiểm tra và in kết quả số hoàn hảo
            Nếu num là số hoàn hảo (hàm trả về true), ngược lại trả về false
            */
            if (isPerfect(num)) {  //if true
                System.out.println(num + " là số hoàn hảo.");
            } else {
                System.out.println(num + " không phải là số hoàn hảo.");
            }
            if (isArmstrong(num)) {
                System.out.println(num + " là số Armstrong.");
            } else {
                System.out.println(num + " không phải là số Armstrong.");
            }
            if (isPalindrome(num)) {
                System.out.println(num + " là số đối xứng.");
            } else {
                System.out.println(num + " không phải là số đối xứng.");
            }
            System.out.println("Tổng các chữ số của " + num + " là: " + sumOfDigits(num));
        }
    }
}
