package buoi2;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("+----------------------+");
            System.out.println("1. Tính điểm sinh viên");
            System.out.println("2. Kiểm tra loại tam giác");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+----------------------+");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    TinhDiemSinhVien.tinhDiemSinhVien();
                    break;
                case 2:
                    KiemTraLoaiTamGiac.kiemTraLoaiTamGiac();
                    break;
                case 3:
                    TinhTienDien.tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        menu();
    }
}
