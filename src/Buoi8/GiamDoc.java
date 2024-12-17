package Buoi8;

public class GiamDoc extends NhanVien {
    private double coPhan; // tính theo tỉ lệ (0.0-1.0), ví dụ 0.2 = 20%

    public GiamDoc(String maNV, String hoTen, String soDienThoai, int soNgayLam, double coPhan) {
        super(maNV, hoTen, soDienThoai, soNgayLam, ChucVu.GIAM_DOC, 300);
        this.coPhan = coPhan;
    }

    @Override
    public double tinhLuongThang() {
        return luong1Ngay * soNgayLam;
    }

    public double tinhThuNhap(double loiNhuanCongTy) {
        return tinhLuongThang() + coPhan * loiNhuanCongTy;
    }

    public double getCoPhan() {
        return coPhan;
    }
}

