package Buoi4;
import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào số lượng phần tử của mảng: ");
        int n = sc.nextInt();

        System.out.println("bắt đầu nhập mảng: ");
        int[] numbers = new int[n];
        for (int index = 0; index < n; index++) {
            System.out.println("nhập vào số thứ: "+(index+1));
            numbers[index] = sc.nextInt();
        }

        System.out.print("hiển thị mảng: ");
        for (int numb : numbers) {
            System.out.print(numb+" ");
        }
        System.out.println();

        int sum =0;
        for (int numb : numbers) {
            sum += numb;
        }
        System.out.println("tổng các phần tử trong mảng: "+sum);

        int max=numbers[0];
        int min=numbers[0];
        for (int numb : numbers) {
            if (numb>max) { max = numb; }
            if (numb<min) { min = numb; }
        }
        System.out.println("số lớn nhất: "+max);
        System.out.println("số nhỏ nhất: "+min);

        // Sắp xếp mảng từ bé đến lớn (Bubble Sort)
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]>numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.print("mảng sau khi sắp xếp: ");
        for (int numb : numbers) {
            System.out.print(numb+" ");
        }
        System.out.println();

        sc.close();
    }
}
