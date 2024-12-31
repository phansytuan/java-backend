package Buoi4;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // buoc 1: nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng số tự nhiên (n): ");
        int n = scanner.nextInt();

        // Khởi tạo mảng có n phần tử
        int[] numbers = new int[n];

        // buoc 2: nhập giá trị từng phần tử của mảng từ người dùng
        System.out.println("Nhập " + n + " số tự nhiên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Số thứ " + (i + 1) + ": "); //cho người dùng dễ dùng hơn
            numbers[i] = scanner.nextInt();
        }

        // buoc 3: hiển thị các phần tử trong mảng
        System.out.println("\nCác số đã nhập:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // buoc 4: tính tổng các phần tử trong mảng
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nTổng các số: " + sum);

        // buoc 5: tìm số min max trong mảng
        /*
        Khởi tạo giá trị ban đầu như đặt một "mốc ban đầu" cho max và min
            Tại sao lại làm như vậy?
        Khi bắt đầu duyệt mảng, bạn cần có một giá trị tham chiếu để so sánh.
        Nếu không khởi tạo giá trị ban đầu cho max và min, chương trình sẽ không biết phải bắt đầu so sánh từ đâu.
        */

        int max = numbers[0];  // Giả định phần tử đầu tiên là lớn nhất
        int min = numbers[0];  // Giả định phần tử đầu tiên là nhỏ nhất
        for (int num : numbers) {
            if (num > max) { max = num; }   // Cập nhật max nếu tìm thấy số lớn hơn
            if (num < min) { min = num; }   // Cập nhật min nếu tìm thấy số nhỏ hơn
        }
        System.out.println("Số lớn nhất: " + max);
        System.out.println("Số nhỏ nhất: " + min);

        // Sắp xếp mảng
        Arrays.sort(numbers); // Sử dụng hàm sort() của thư viện Arrays
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        for (int num : numbers) {
            System.out.print(num + " "); // In mảng đã sắp xếp
        }
        scanner.close();
    }
}

