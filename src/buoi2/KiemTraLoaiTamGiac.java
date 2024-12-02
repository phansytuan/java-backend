package buoi2;
import java.util.Scanner;

public class KiemTraLoaiTamGiac {
    public static void main(String[] args) {
        kiemTraLoaiTamGiac();
    }

    public static void kiemTraLoaiTamGiac() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        int a = sc.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = sc.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Tam giác đều");
            } else if (a == b || b == c || a == c) {
                if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                    System.out.println("Tam giác vuông cân");
                } else {
                    System.out.println("Tam giác cân");
                }
            } else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                System.out.println("Tam giác vuông");
            } else {
                System.out.println("Tam giác thường");
            }
        } else {
            System.out.println("Không phải tam giác");
        }
    }
}
