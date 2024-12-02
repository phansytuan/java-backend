package buoi4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai3ArrayOperations {
    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if(n == 2)
            return true;
        if(n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0)
                return false;
        return true;
    }

    // Hàm tính trung bình của mảng
    public static double average(int[] arr) {
        int sum = 0;
        for (int num : arr)
            sum += num;
        return (double) sum / arr.length;
    }

    // Hàm mở rộng mảng
    public static int[] expandArray(int[] arr) {
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        return newArr;
    }

    // Hàm xoá phần tử khỏi mảng
    public static int[] removeElement(int[] arr, int value) {
        int count = 0;
        for (int num : arr)
            if (num == value)
                count++;
        if (count == 0) {
            System.out.println("Phần tử không tồn tại trong mảng.");
            return arr;
        }
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int num : arr) {
            if (num != value) {
                newArr[index++] = num;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // 2. Tính tổng các phần tử chẵn và lẻ
        int sumEven = 0, sumOdd = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                sumEven += num;
            else
                sumOdd += num;
        }
        System.out.println("Tổng các phần tử chẵn: " + sumEven);
        System.out.println("Tổng các phần tử lẻ: " + sumOdd);

        // 3. Tìm và in ra các số nguyên tố trong mảng
        System.out.print("Các số nguyên tố trong mảng: ");
        boolean hasPrime = false;
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                hasPrime = true;
            }
        }
        if (!hasPrime)
            System.out.print("Không có số nguyên tố nào.");
        System.out.println();

        // 4. Sắp xếp mảng
        // Tạo hai danh sách cho số chẵn và lẻ
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0)
                evenList.add(num);
            else
                oddList.add(num);
        }
        // Sắp xếp số chẵn giảm dần
        evenList.sort((a, b) -> b - a);
        // Sắp xếp số lẻ tăng dần
        oddList.sort((a, b) -> a - b);
        // Kết hợp lại thành mảng đã sắp xếp
        int index = 0;
        for (int num : evenList)
            arr[index++] = num;
        for (int num : oddList)
            arr[index++] = num;
        System.out.println("Mảng sau khi sắp xếp:");
        System.out.println(Arrays.toString(arr));

        // 5. Chia mảng thành 2 mảng con
        double avg = average(arr);
        ArrayList<Integer> lessThanOrEqualAvg = new ArrayList<>();
        ArrayList<Integer> greaterThanAvg = new ArrayList<>();
        for (int num : arr) {
            if (num <= avg)
                lessThanOrEqualAvg.add(num);
            else
                greaterThanAvg.add(num);
        }
        System.out.println("Trung bình của mảng: " + avg);
        System.out.println("Mảng các phần tử <= trung bình: " + lessThanOrEqualAvg);
        System.out.println("Mảng các phần tử > trung bình: " + greaterThanAvg);

        // 6. Tìm số lượng phần tử trùng lặp
        ArrayList<Integer> duplicates = new ArrayList<>();
        int duplicateCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate && !duplicates.contains(arr[i])) {
                duplicates.add(arr[i]);
                duplicateCount++;
            }
        }
        System.out.println("Số lượng phần tử trùng lặp: " + duplicateCount);
        if (duplicateCount > 0)
            System.out.println("Các phần tử trùng lặp: " + duplicates);

        // 7. Thêm một phần tử vào mảng
        System.out.print("Nhập giá trị phần tử cần thêm: ");
        int valueToAdd = scanner.nextInt();
        System.out.print("Nhập vị trí cần thêm (index): ");
        int position = scanner.nextInt();
        if (position < 0 || position > arr.length) {
            System.out.println("Vị trí không hợp lệ. Tự động thêm vào cuối mảng.");
            position = arr.length;
        }
        if (arr.length == n) {
            arr = expandArray(arr);
        }
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = valueToAdd;
        System.out.println("Mảng sau khi thêm phần tử:");
        System.out.println(Arrays.toString(arr));

        // 8. Xoá một phần tử khỏi mảng
        System.out.print("Nhập giá trị phần tử cần xoá: ");
        int valueToRemove = scanner.nextInt();
        arr = removeElement(arr, valueToRemove);
        System.out.println("Mảng sau khi xoá phần tử:");
        System.out.println(Arrays.toString(arr));

        scanner.close();
    }
}
