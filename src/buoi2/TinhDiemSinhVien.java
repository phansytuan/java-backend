package buoi2;
import java.util.Scanner;

public class TinhDiemSinhVien {
    public static void main(String[] args) {
        tinhDiemSinhVien();
    }

    public static void tinhDiemSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm chuyên cần: ");
        double chuyenCan = sc.nextDouble();
        System.out.print("Nhập điểm giữa kỳ: ");
        double giuaKy = sc.nextDouble();
        System.out.print("Nhập điểm cuối kỳ: ");
        double cuoiKy = sc.nextDouble();
        double diemTrungBinh = (chuyenCan * 0.2) + (giuaKy * 0.3) + (cuoiKy * 0.5);
        char loai;

        if (diemTrungBinh >= 9) {
            loai = 'A';
        } else if (diemTrungBinh >= 7) {
            loai = 'B';
        } else if (diemTrungBinh >= 5) {
            loai = 'C';
        } else {
            loai = 'D';
        }
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("Xếp loại: " + loai);
    }
}


